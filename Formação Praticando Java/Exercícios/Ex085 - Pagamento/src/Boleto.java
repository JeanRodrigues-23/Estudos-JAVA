public class Boleto extends Pagamento{
    private double percentualTaxa = 1;

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        double taxaAPagar = getValor() * (percentualTaxa / 100);
        System.out.printf("Boleto de R$ %.2f gerado com sucesso (taxa: R$ %.2f)%n", getValor(), taxaAPagar);
    }
}
