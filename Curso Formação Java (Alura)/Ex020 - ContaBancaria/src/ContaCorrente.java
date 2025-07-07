public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal() {
        saldo -= getTarifaMensal();
    }
}
