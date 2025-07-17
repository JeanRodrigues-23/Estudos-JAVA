package br.com.todolist.servico;

import br.com.todolist.modelo.TaskItem;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    public List<TaskItem> tarefas;

    public TaskService() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTask(TaskItem task) {
        tarefas.add(task);
    }

    public void listarTasks() {
        System.out.println("Aqui estão suas tarefas:");
        for (TaskItem item : tarefas) {
        System.out.println("Tarefa: " + tarefas.indexOf(item) + ": " + item);
        }
    }

    public void marcarConcluida(int indice) {
            tarefas.get(indice).marcarComoConcluida();
    }

    public void removerTask(int indice) {
            tarefas.remove(indice);
        }
    }

