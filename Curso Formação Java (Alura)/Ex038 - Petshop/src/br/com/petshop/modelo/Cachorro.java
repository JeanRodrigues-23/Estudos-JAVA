package br.com.petshop.modelo;

import java.sql.SQLOutput;

public class Cachorro extends Animal{
    private String raca;
    private String cor;

    public Cachorro(String nome, int idade, String tipo, String raca, String cor) {
        super(nome, idade, tipo);
        this.raca = raca;
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU!");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(String.format("""
                - Lista informativa do cachorro -
                Nome: %s
                Idade: %d
                Tipo: %s
                Raca: %s
                Cor: %s
                Som que faz:
                """, getNome(), getIdade(), getTipo(), getRaca(), getCor()));
        emitirSom();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Tipo: " + getTipo() + ", Raça: " + getRaca() + " , Cor: " + getCor();
    }
}