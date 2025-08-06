package br.com.todolist.modelo;

public interface TaskItem {
    String getTitulo();
    String getDescricao();
    boolean isConcluida();
    void marcarComoConcluida();
    String toString();
}
