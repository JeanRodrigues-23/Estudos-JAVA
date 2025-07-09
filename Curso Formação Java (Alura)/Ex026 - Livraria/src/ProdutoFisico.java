public class ProdutoFisico extends Produto implements Calculavel{
    @Override
    public void calcularPrecoFinal() {
        setPreco(getPreco() * 0.90);
        System.out.println("O valor do produto agora é: " + getPreco());
    }
}
