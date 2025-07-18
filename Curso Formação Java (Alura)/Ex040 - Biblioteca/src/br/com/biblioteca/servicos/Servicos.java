package br.com.biblioteca.servicos;

import br.com.biblioteca.modelos.LeitorComum;
import br.com.biblioteca.modelos.Livro;
import br.com.biblioteca.modelos.Pesquisador;
import br.com.biblioteca.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicos {
    private List<Usuario> listaUsuarios;
    private List<Livro> listaLivros;
    private final Scanner leitura = new Scanner(System.in);

    public Servicos() {
        listaUsuarios = new ArrayList<>();
        listaLivros = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario leitor) {
        listaUsuarios.add(leitor);
    }

    public void adicionarLivros(Livro livro) {
        listaLivros.add(livro);
    }

    public void emprestarLivro() {
        listarUsuarios();
        System.out.println("Escreva o índice do usuário que pegará o livro emprestado:");
        int indiceUsuario = leitura.nextInt();
        leitura.nextLine();

        listarLivros();
        System.out.println("Escreva o índice do livro que deseja emprestar:");
        int indiceLivro = leitura.nextInt();
        leitura.nextLine();

        Usuario usuario = listaUsuarios.get(indiceUsuario);
        Livro livro = listaLivros.get(indiceLivro);

        if (usuario instanceof LeitorComum) {
            if (usuario.getLivrosEmprestados().size() < 3 && livro.isDisponivel()) {
                usuario.getLivrosEmprestados().add(livro);
                livro.setDisponivel(false);
                System.out.println("Livro" + livro.getTitulo() + " empresado para " + usuario.getNome() + "!");
            } else {
                System.out.println("Livro indisponível ou usuário com limite de empréstimos atingido.");
            }
        } else if (usuario instanceof Pesquisador) {
            if (usuario.getLivrosEmprestados().size() < 5 && livro.isDisponivel()) {
                usuario.getLivrosEmprestados().add(livro);
                System.out.println("Livro" + livro.getTitulo() + " empresado para " + usuario.getNome() + "!");
            } else {
                System.out.println("Livro indisponível ou usuário com limite de empréstimos atingido.");
            }
        }
    }

    public void devolverLivro() {
        listarLivros();
        System.out.println("Escreva o índice do livro que deseja devolver:");
        int indice = leitura.nextInt();
        leitura.nextLine();

        Livro livro = listaLivros.get(indice);

        if (livro.isDisponivel()) {
            System.out.println("Este livro não está emprestado.");
        } else {
            for (Usuario leitor : listaUsuarios) {
                for (Livro item : leitor.getLivrosEmprestados()) {
                    if (item.getId() == livro.getId()) {
                        leitor.getLivrosEmprestados().remove(livro);
                        livro.setDisponivel(true);
                        System.out.println("Livro devolvido!");
                    }
                }
            }
        }
    }

    public void listarLivros() {
        System.out.println("LISTA DE LIVROS E DISPONIBILIDADE");
        for (Livro item : listaLivros) {
            if (item.isDisponivel()) {
                System.out.println((listaLivros.indexOf(item) + 1) + " - " + item.getTitulo() + " - Está disponível!");
            } else {
                for (Usuario leitor : listaUsuarios) {
                    for (Livro livro : leitor.getLivrosEmprestados()) {
                        if (item.getId() == livro.getId()) {
                            System.out.println((leitor.getLivrosEmprestados().indexOf(item) + 1) + " - " + item.getTitulo() + " - Está emprestado para " + leitor.getNome());
                        }
                    }
                }
            }
        }
        System.out.println("-----------------------------");
    }

    public void listarUsuarios() {
        System.out.println("LISTA DE USUÁRIOS E OS LIVROS QUE PEGARAM");
            for (Usuario leitor : listaUsuarios) {
                System.out.println((listaUsuarios.indexOf(leitor) + 1) + " - " + leitor.getNome() + " - Livros emprestados: " + leitor.getLivrosEmprestados());
            }
        System.out.println("-----------------------------");
    }

    public void cadastrarUsuario() {
        System.out.print("Vamos cadastrar seu usuário! \nMe informe seu nome e sobrenome:");
        String nome = leitura.nextLine();
        System.out.print("Será que tipo de usuário?");

        while (true) {
            System.out.println(String.format("""
                    \n[1] Leitor comum
                    [2] Pesquisador
                    """));
            int opcaoUsuario = leitura.nextInt();
            leitura.nextLine();

            if (opcaoUsuario == 1) {
                LeitorComum leitor = new LeitorComum(nome);
                adicionarUsuario(leitor);
                System.out.println("Entendido! Lembrando que usuários comuns podem ter até 3 livros emprestados.");
                break;
            } else if (opcaoUsuario == 2) {
                Pesquisador pesquisador = new Pesquisador(nome);
                adicionarUsuario(pesquisador);
                System.out.println("Entendido! Lembrando que pesquisadores podem ter até 5 livros emprestados.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

}
