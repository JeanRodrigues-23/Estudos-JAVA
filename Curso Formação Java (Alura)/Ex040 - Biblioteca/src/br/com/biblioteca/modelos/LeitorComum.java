package br.com.biblioteca.modelos;

import java.util.ArrayList;

public class LeitorComum extends Usuario{

    public LeitorComum(String nome) {
        super(nome);
        setTipo("Leitor comum");
        setLivrosEmprestados(new ArrayList<>());
        System.out.println("Usuário cadastrado!");
    }
}
