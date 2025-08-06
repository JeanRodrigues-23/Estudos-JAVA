public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Carlos", 800.0);

        conta1.depositar(-100.0);
        conta1.sacar(50.0);

        conta1.exibirSaldo();
    }
}
