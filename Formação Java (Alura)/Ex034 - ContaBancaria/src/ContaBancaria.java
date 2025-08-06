public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria (int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }
}
