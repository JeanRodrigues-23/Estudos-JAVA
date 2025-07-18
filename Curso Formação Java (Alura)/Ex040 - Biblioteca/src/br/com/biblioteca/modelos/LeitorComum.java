package br.com.biblioteca.modelos;

import br.com.biblioteca.servicos.Servicos;

import java.util.ArrayList;

public class LeitorComum extends Usuario{

    public LeitorComum(String nome) {
        super(nome);
        setTipo("Leitor comum");
        setLivrosEmprestados(new ArrayList<>());
        System.out.println("Usuário cadastrado!");
    }
}
