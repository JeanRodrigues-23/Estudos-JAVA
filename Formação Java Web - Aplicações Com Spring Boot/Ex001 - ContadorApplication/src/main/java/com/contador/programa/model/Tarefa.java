package com.contador.programa.model;

public class Tarefa {
    private String descricao;
    private boolean  concluida;
    private String pessoaResponsavel;

    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public Tarefa(){}

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + " - Pessoa responsável: " + pessoaResponsavel + " - Concluída? " + concluida;
    }
}
