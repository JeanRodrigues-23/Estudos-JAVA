package br.com.biblioteca.Aplicacao;

import br.com.biblioteca.model.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Manual de Departamento Pessoal", "Heverton De Oliveira Andrade", 488);

        livro1.resumoLivro();
    }
}
