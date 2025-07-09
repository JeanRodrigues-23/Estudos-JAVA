public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setPreco(100);
        livro.calcularPrecoFinal();

        ProdutoFisico produto = new ProdutoFisico();
        produto.setPreco(100);
        produto.calcularPrecoFinal();
    }
}
