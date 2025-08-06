package br.com.ecommerce.main;

import br.com.ecommerce.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Teclado", 120.0, 6);
        Item item2 = new Item("Monitor", 867.99, 2);
        Item item3 = new Item("Cadeira Gamer", 1200.0, 5);
        Item item4 = new Item("Notebook", 5000.0, 8);
        Item item5 = new Item("Caixa de som", 149.99, 10);

        List<Item> listaItens = new ArrayList<>();
        listaItens.add(item1);
        listaItens.add(item2);
        listaItens.add(item3);
        listaItens.add(item4);
        listaItens.add(item5);

        double somaCarrinho = 0;
        for(Item item : listaItens) {
            somaCarrinho += item.valorTotalItem();
        }

        System.out.printf("Valor total da compra: R$ %.2f%n", somaCarrinho);
    }
}
