public class PIX extends Pagamento {

    public PIX(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via PIX de R$ %.2f confirmado!%n", getValor());
    }
}
