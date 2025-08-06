package br.com.todolist.modelo;

public class PersonalTask extends Task{
    private String local;

    public PersonalTask(String titulo, String descricao, String local) {
        super(titulo, descricao);
        this.local = local;
    }

    @Override
    public String toString() {
        return getTitulo() + " - " + getDescricao() + " - Local: " + local;
    }
}
