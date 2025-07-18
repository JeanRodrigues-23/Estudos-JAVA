package br.com.todolist.aplicacao;

import br.com.todolist.modelo.PersonalTask;
import br.com.todolist.modelo.WorkTask;
import br.com.todolist.servico.TaskService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService servico = new TaskService();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Vamos organizar suas tarefas!");
        int opcao = 1;
        while (opcao != 0) {
            System.out.print(String.format("""
                    -- MENU --
                    [1] Criar tarefa pessoal
                    [2] Criar tarefa para trabalho
                    [3] Mostrar tarefas
                    [4] Marcar tarefa como concluída
                    [5] Remover tarefa da lista
                    [0] Fechar organizador de tarefas
                    
                    Selecione uma opção: 
                    """));
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao) {
                case 1: {
                    System.out.print("Escreva o título da tarefa: ");
                    String titulo = leitura.nextLine();
                    System.out.print("Escreva a descrição da tarefa: ");
                    String descricao = leitura.nextLine();
                    System.out.print("Onde será feito?");
                    String local = leitura.nextLine();
                    PersonalTask tarefa = new PersonalTask(titulo, descricao, local);
                    servico.adicionarTask(tarefa);
                    System.out.println("Tarefa criada!\n");
                    break;
                }
                case 2: {
                    System.out.print("Escreva o titulo da tarefa: ");
                    String titulo = leitura.nextLine();
                    System.out.print("Escreva a descrição da tarefa: ");
                    String descricao = leitura.nextLine();
                    System.out.print("Faz parte de qual projeto? ");
                    String projeto = leitura.nextLine();
                    WorkTask tarefa = new WorkTask(titulo, descricao, projeto);
                    servico.adicionarTask(tarefa);
                    System.out.println("Tarefa criada!\n");
                    break;
                }
                case 3: {
                    servico.listarTasks();
                    break;
                }
                case 4: {
                    System.out.println("Qual tarefa deseja marcar como concluída?");
                    servico.listarTasks();
                    System.out.println("Escreva o índice da tarefa:");
                    int indice = leitura.nextInt();
                    leitura.nextLine();
                    servico.marcarConcluida(indice);
                    System.out.println("Tarefa marcada como concluída!\n");
                    break;
                }
                case 5: {
                    System.out.println("Qual tarefa deseja remover?");
                    servico.listarTasks();
                    System.out.println("Escreva o índice da tarefa:");
                    int indice = leitura.nextInt();
                    leitura.nextLine();
                    servico.removerTask(indice);
                    System.out.println("Tarefa removida!\n");
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                }
             }
        }
        leitura.close();
    }
}
