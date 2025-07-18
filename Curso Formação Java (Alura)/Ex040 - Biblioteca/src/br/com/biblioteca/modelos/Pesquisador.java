package br.com.biblioteca.modelos;

import java.util.ArrayList;

public class Pesquisador extends Usuario{

    public Pesquisador(String nome) {
        super(nome);
        setTipo("Pesquisador");
        setLivrosEmprestados(new ArrayList<>());
    }
}
