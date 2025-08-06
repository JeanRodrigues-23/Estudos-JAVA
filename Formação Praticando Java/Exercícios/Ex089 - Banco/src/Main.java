public class Main {
    public static void main(String[] args) {
        OperacaoBancaria deposito1 = new Deposito(250.00);
        OperacaoBancaria saque1 = new Saque(50.50);

        deposito1.executar();
        saque1.executar();
    }
}
