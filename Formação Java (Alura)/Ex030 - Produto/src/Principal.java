import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Sapato", 200, 50);
        Produto produto2 = new Produto("caderno", 25, 200);
        Produto produto3 = new Produto("Calça", 130, 70);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        System.out.println("A lista tem " + produtos.size() + " produtos!");
        System.out.println("O primeiro produto é: " + produtos.get(0));
        System.out.println("\nLista de produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        ProdutoPerecivel produto4 = new ProdutoPerecivel("balinha", 0.25, 50, "11/07/2025");
        produto4.exibirProdutoPerecivel();
    }
}
