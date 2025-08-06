package br.com.todolist.modelo;

public abstract class Task implements TaskItem{
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Task(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public void marcarComoConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return getTitulo() + " - " + getDescricao();
    }
}
