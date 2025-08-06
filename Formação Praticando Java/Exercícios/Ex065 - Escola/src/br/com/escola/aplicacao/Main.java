package br.com.escola.aplicacao;

import br.com.escola.model.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Bezerra", 2, 6.2);
        aluno1.relatorioAluno();
    }
}
