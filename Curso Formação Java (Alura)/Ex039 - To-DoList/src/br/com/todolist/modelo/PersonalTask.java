package br.com.todolist.modelo;

public class PersonalTask extends Task{
    private String local;

    public PersonalTask(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public String toString() {
        return "Tarefa: " + getTitulo() + " Descrição: " + getDescricao() + "Local: " + this.local;
    }
}
