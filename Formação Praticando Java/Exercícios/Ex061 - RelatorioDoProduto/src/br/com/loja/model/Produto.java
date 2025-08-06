package br.com.loja.model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirProduto() {
        System.out.printf("""
                Nome: %s
                Preço: %.2f
                Quantidade: %d
                """, nome, preco, quantidade);
    }
}
