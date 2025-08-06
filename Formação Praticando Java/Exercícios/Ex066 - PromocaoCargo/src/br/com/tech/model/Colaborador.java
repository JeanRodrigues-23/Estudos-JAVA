package br.com.tech.model;

public class Colaborador {
    private String nome;
    private String cargo;
    private int nivelDeAcesso;

    public Colaborador(String nome, String cargo, int nivelDeAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void promocao(String cargo, int nivelDeAcesso) {
        System.out.printf("""
                -- Antes da atualização --
                Nome: %s
                Cargo: %s
                Nível de acesso: %d%n
                """, this.nome, this.cargo, this.nivelDeAcesso);

        this.cargo = cargo;
        this.nivelDeAcesso = nivelDeAcesso;

        System.out.printf("""
                -- Após atualização --
                Nome: %s
                Cargo: %s
                Nível de acesso: %d
                """, this.nome, this.cargo, this.nivelDeAcesso);
    }
}
