package br.com.biblioteca.modelos;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private String anoDePublicacao;
    private boolean disponivel;
    private int id;

    static int idAutomatico = 0;

    public Livro() {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Vamos cadastrar seu livro! Me informe o título:");
        this.titulo = leitura.nextLine();
        System.out.print("Me informe o autor:");
        this.autor = leitura.nextLine();
        System.out.print("Me informe o ano de publicação:");
        this.anoDePublicacao = leitura.nextLine();

        this.disponivel = true;
        this.id = idAutomatico + 1;
        idAutomatico =+ 1;

        System.out.println("Livro cadastrado!");

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public int getId() {
        return id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return getTitulo();
    }

}
