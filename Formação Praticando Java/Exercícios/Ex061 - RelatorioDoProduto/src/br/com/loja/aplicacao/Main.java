package br.com.loja.aplicacao;

import br.com.loja.model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Mouse gamer", 159.9, 25);
        produto1.exibirProduto();
    }
}
