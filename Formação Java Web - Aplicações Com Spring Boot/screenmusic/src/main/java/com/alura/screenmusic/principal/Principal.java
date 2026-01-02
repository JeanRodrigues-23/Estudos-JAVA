package com.alura.screenmusic.principal;

import com.alura.screenmusic.model.Artista;
import com.alura.screenmusic.model.Musica;
import com.alura.screenmusic.repository.ArtistaReposotiry;
import com.alura.screenmusic.repository.MusicaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private final ArtistaReposotiry artistaReposotiry;
    private final MusicaRepository musicaRepository;

    public Principal(ArtistaReposotiry artistaReposotiry, MusicaRepository musicaRepository) {
        this.artistaReposotiry = artistaReposotiry;
        this.musicaRepository = musicaRepository;
    }

    public void executarMenu() {
        int opcao = -1;
        while (opcao != 9) {
            System.out.printf("""
                    *** Bem-vindo ao Screenmusic ***
                    
                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artistas
                    5 - Pesquisar dados sobre um artista
                    
                    9 - Sair
                    
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtista();
                    break;
                case 5:
                    //Metodo
                    break;
                case 9:
                    System.out.println("Saindo...");
            }
        }
    }

    private void cadastrarArtistas() {
        while (true) {
            System.out.println("Digite o nome do artista:");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do artista:");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o gênero musical do artista:");
            String genero = scanner.nextLine();
            System.out.println("Este artista é de qual década?");
            int decada = scanner.nextInt();
            scanner.nextLine();

            Artista artista = new Artista(nome, idade, genero, decada);
            artistaReposotiry.save(artista);

            System.out.println("Artista salvo com sucesso! Deseja cadastrar outro (n ou s)?");
            String escolha = scanner.nextLine();
            while (!escolha.equalsIgnoreCase("n") && !escolha.equalsIgnoreCase("s")) {
                System.out.println("Não entendi. Responda com 's' ou 'n'. Deseja cadastrar outro artista?");
                escolha = scanner.nextLine();
            }
            if (escolha.equalsIgnoreCase("s")) {
                continue;
            } else {
                break;
            }
        }
    }

    private void cadastrarMusicas() {
        while(true) {
            System.out.println("Digite o nome da música:");
            String nome = scanner.nextLine();
            System.out.println("Digite a data de lançamento (yyyy-MM-dd):");
            LocalDate dataLancamento = LocalDate.parse(scanner.nextLine());
            System.out.println("Digite o gênero da música:");
            String genero = scanner.nextLine();

            Optional<Artista> artistaOptional;
            do {
                System.out.println("Digite o nome do artista:");
                String artista = scanner.nextLine();
                artistaOptional = artistaReposotiry.findByNomeContainingIgnoreCase(artista);

                if (artistaOptional.isEmpty()) {
                    System.out.println("Não localizei este artista. Cadastre-o primeiro.");
                }
            } while (artistaOptional.isEmpty());

            Musica musica = new Musica(nome, dataLancamento, genero, artistaOptional.get());
            musicaRepository.save(musica);
            System.out.println("Música salva com sucesso!");
            break;
        }
    }

    public void listarMusicas() {
        System.out.println("-- Lista de músicas salvas --");
        List<Musica> musicaList = musicaRepository.findAll();
        musicaList.forEach(System.out::println);
    }

    public void buscarMusicasPorArtista() {

        System.out.println("Digite o nome do artista: ");
        String nomeArtista = scanner.nextLine();

        Optional<Artista> artistaOptional = artistaReposotiry.findByNomeContainingIgnoreCase(nomeArtista);

        while (artistaOptional.isEmpty()) {
            System.out.println("Não encontrei o artista. Digite o nome novamente:");
            nomeArtista = scanner.nextLine();
            artistaOptional = artistaReposotiry.findByNomeContainingIgnoreCase(nomeArtista);
        }

        System.out.println("Musicas que pertencem ao artista " + artistaOptional.get().getNome());
        artistaOptional.get().getMusicas().forEach(System.out::println);
    }
}
