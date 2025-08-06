public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "Jean";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Saldo atualizado " + conta.getSaldo());
    }
}
