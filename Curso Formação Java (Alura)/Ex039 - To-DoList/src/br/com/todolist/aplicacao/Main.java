package br.com.todolist.aplicacao;

import br.com.todolist.modelo.PersonalTask;
import br.com.todolist.modelo.WorkTask;
import br.com.todolist.servico.TaskService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService servico = new TaskService();
        Scanner leitura = new Scanner(System.in);

        int opcao = 1;
        while (opcao != 0) {
            System.out.println(String.format("""
                    Olá! Vamos organizar suas tarefas!
                    [1] Criar tarefa pessoal
                    [2] Criar tarefa para trabalho
                    [3] Mostrar tarefas
                    [4] Marcar tarefa como concluída
                    [5] Remover tarefa da lista
                    [0} Fechar organizador de tarefas
                    """));
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Escreva o título da tarefa: ");
                    String titulo = leitura.nextLine();
                    System.out.print("Escreva a descrição da tarefa: ");
                    String descricao = leitura.nextLine();
                    PersonalTask tarefa = new PersonalTask(titulo, descricao);
                    servico.tarefas.add(tarefa);
                    break;
                case 2:
                    System.out.print("Escreva o titulo da tarefa: ");
                    titulo = leitura.nextLine();
                    System.out.print("Escreva a descrição da tarefa: ");
                    descricao = leitura.nextLine();
                    tarefa = new PersonalTask(titulo, descricao);
                    servico.tarefas.add(tarefa);
                    break;
                case 3:
                    servico.listarTasks();
                case 4:
                    System.out.println("Qual tarefa deseja marcar como concluída?");
                    servico.listarTasks();
                    System.out.println("Escreva o índice da tarefa:");
                    int indice = leitura.nextInt();
                    servico.tarefas.get(indice).marcarComoConcluida();
                case 5:
                    System.out.println("Qual tarefa deseja remover?");
                    servico.listarTasks();
                    System.out.println("Escreva o índice da tarefa:");
                    indice = leitura.nextInt();
                    servico.tarefas.remove(indice);
             }
        }
    }
}
