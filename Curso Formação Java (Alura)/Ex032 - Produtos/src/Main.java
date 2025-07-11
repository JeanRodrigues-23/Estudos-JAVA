import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 2.00);
        Produto produto2 = new Produto("Saco de arroz", 15.00);
        Produto produto3 = new Produto("Camiseta", 60.00);
        Produto produto4 = new Produto("Celular", 2000.00);
        Produto produto5 = new Produto("Curso de Java", 1500.00);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        listaDeProdutos.add(produto5);

        double somaPreco = 0;
        for(Produto item : listaDeProdutos) {
            somaPreco += item.getpreco();
        }
        double mediaPreco = somaPreco / listaDeProdutos.size();
        System.out.println(String.format("O preço médio dos produtos é de R$ %.2f", mediaPreco));


    }
}
