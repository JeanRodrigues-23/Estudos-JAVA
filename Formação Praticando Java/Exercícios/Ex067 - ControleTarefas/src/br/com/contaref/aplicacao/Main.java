package br.com.contaref.aplicacao;

import br.com.contaref.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa("Lavar roupa", true);
        Tarefa t2 = new Tarefa("Pentear cabelo", false);
        Tarefa t3 = new Tarefa("Passar pano na mesa", false);
        Tarefa t4 = new Tarefa("Fazer comida", true);
        Tarefa t5 = new Tarefa("Limpar o chão", false);

        List<Tarefa> listaTarefas = new ArrayList<>();
        listaTarefas.add(t1);
        listaTarefas.add(t2);
        listaTarefas.add(t3);
        listaTarefas.add(t4);
        listaTarefas.add(t5);

        for(Tarefa tarefa : listaTarefas) {
            tarefa.exibirTarefa();
        }

    }
}
