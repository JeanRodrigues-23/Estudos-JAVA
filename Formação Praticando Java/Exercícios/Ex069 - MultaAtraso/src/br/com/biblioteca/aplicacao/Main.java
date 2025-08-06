package br.com.biblioteca.aplicacao;

import br.com.biblioteca.model.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 10);

        livro1.multaAtraso();
        livro1.exibirDetalhes();
    }
}
