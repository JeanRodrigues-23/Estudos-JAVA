public class Cartao extends Pagamento{
    private double percentualTaxa = 3;

    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        double taxaAPagar = getValor() * (percentualTaxa / 100);
        System.out.printf("Pagamento de R$ %.2f confirmado no cartão de crédito (taxa: R$ %.2f)%n", getValor(), taxaAPagar);
    }
}
