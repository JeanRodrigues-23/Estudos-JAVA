package br.com.escola.model;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void relatorioAluno() {
        double mediaNotas = (nota1 + nota2) / 2;
        System.out.printf("""
                Nome: %s
                Nota 1: %.1f
                Nota 2: %.1f
                Média: %.1f
                """, this.nome, this.nota1, this.nota2, mediaNotas);
        if (mediaNotas >= 7) {
            System.out.println("Situação: aprovado");
        } else {
            System.out.println("Situação: reprovado");
        }
    }
}
