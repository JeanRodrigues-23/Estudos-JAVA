package com.alura.screenmusic.principal;

import com.alura.screenmusic.model.Artista;
import com.alura.screenmusic.model.Genero;
import com.alura.screenmusic.repository.ArtistaReposotiry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private final ArtistaReposotiry artistaReposotiry;

    public Principal(ArtistaReposotiry artistaReposotiry) {
        this.artistaReposotiry = artistaReposotiry;
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
                    //Metodo
                    break;
                case 3:
                    //Metodo
                    break;
                case 4:
                    //Metodo
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

            System.out.println("Artista salvo com sucesso! Deseja cadastrar outro?");
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
}
