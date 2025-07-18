package br.com.biblioteca.aplicacao;

import br.com.biblioteca.modelos.LeitorComum;
import br.com.biblioteca.modelos.Livro;
import br.com.biblioteca.modelos.Pesquisador;
import br.com.biblioteca.servicos.Servicos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Servicos servico = new Servicos();

        System.out.println("Seja bem vindo à nossa biblioteca!\n");
        int opcao = 1;
        while (opcao != 0) {
            System.out.println(String.format("""
                    MENU
                    [1] Cadastrar um livro.
                    [2] Cadastrar um usuário.
                    [3] Emprestar um livro para o usuário.
                    [4] Registrar devolução de um livro.
                    [5] Listar todos os livros e disponibilidade.
                    [6] Listar todos os usuários e seus livros emprestados.
                    
                    [0] Sair do programa.
                    
                    Escolha uma opção:
                    """));
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1: {
                    Livro livro = new Livro();
                    servico.adicionarLivros(livro);
                    break;
                }
                case 2: {
                    servico.cadastrarUsuario();
                    break;
                }
                case 3: {
                    servico.emprestarLivro();
                    break;
                }
                case 4: {
                    servico.devolverLivro();
                    break;
                }
                case 5: {
                    servico.listarLivros();
                    break;
                }
                case 6: {
                    servico.listarUsuarios();
                    break;
                }
                case 0: {
                    System.out.println("Obrigado por utilizar o nosso sistema!");
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }
            }
        }
    }
}
