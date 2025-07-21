package br.com.biblioteca.modelos;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nome;
    private String tipo;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        setLivrosEmprestados(new ArrayList<>());
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
