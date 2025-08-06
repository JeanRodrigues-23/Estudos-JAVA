package br.com.contaref.model;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao, boolean concluida) {
        this.concluida = concluida;
        this.descricao = descricao;
    }

    public void exibirTarefa() {
        System.out.print("Tarefa: " + this.descricao);

        if (concluida) {
            System.out.println(" - Status: concluída");
        } else {
            System.out.println(" - Status: pendente");
        }

    }
}
