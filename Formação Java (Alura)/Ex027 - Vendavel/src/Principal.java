public class Principal {
    public static void main(String[] args) {
        Servico servico = new Servico();
        servico.setHoras(3);
        servico.setPrecoHora(50);
        servico.aplicaDescontos();
        servico.calculaTotal();

        Produto produto = new Produto();
        produto.setPreco(100);
        produto.setQuantidade(2);
        produto.aplicaDescontos();
        produto.calculaTotal();
    }
}
