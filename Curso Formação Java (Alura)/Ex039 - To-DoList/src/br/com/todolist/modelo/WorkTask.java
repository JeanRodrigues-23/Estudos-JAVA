package br.com.todolist.modelo;

public class WorkTask extends Task{
    private String projeto;

    public WorkTask(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public String toString() {
        return "Tarefa: " + getTitulo() + " Descrição: " + getDescricao() + "Local: " + this.projeto;
    }
}
