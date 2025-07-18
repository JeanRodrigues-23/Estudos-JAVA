package br.com.biblioteca.modelos;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nome;
    private String tipo;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        setLivrosEmprestados(new ArrayList<>());
        System.out.println("Usuário cadastrado!");
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
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
