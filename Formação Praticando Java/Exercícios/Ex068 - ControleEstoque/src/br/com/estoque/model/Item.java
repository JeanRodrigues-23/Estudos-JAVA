package br.com.estoque.model;

public class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void vender(int vendido){
        if (vendido > this.quantidade) {
            System.out.println("Estoque insuficiente.");
        } else {
            this.quantidade -= vendido;
            System.out.printf("Venda realizada! Estoque restante de %s: %d%n", this.nome, this.quantidade);
        }
    }
}
