package br.com.todolist.modelo;

public class WorkTask extends Task{
    private String projeto;

    public WorkTask(String titulo, String descricao, String projeto) {
        super(titulo, descricao);
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        return getTitulo() + " - " + getDescricao() + " - Projeto: " + projeto;
    }
}
