public class Compra {

    public static void main(String[] args) {

        double precoProduto = 2.50;
        int quantidade = 6;
        double total = precoProduto * quantidade;

        System.out.println(String.format("O valor total é de %.2f reais", total));

    }

}
