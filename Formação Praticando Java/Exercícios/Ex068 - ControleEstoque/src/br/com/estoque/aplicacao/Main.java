package br.com.estoque.aplicacao;

import br.com.estoque.model.Item;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Tênis", 20);

        item1.vender(5);
        item1.vender(16);
    }
}
