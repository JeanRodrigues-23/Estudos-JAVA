public class Produto implements Vendavel{
    private double preco;
    private int quantidade;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void calculaTotal() {
        double total = preco * quantidade;
        System.out.println("O valor a ser pago é de: R$" + total);
    }

    @Override
    public void aplicaDescontos() {
        double total = preco * quantidade;
        total *= 0.90;
        System.out.println("O valor a ser pago é de: R$" + total);
    }
}
