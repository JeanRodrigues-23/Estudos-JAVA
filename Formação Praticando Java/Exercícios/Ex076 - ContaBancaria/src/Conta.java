public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            this.saldo += valorDepositado;
            System.out.println("Valor de " + valorDepositado + " depositado!");
            System.out.println("Saldo atualizado: R$" + this.saldo);
        } else {
            System.out.println("Valor inválido! Tente realizar um novo depósito.");
        }
    }

    public void sacar(double valorDeSaque) {
        if (valorDeSaque > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valorDeSaque;
            System.out.println("Saque no valor de R$" + valorDeSaque + " realizado!");
            System.out.println("Saldo atualizado: R$" + this.saldo);
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s é: %.2f", this.titular, this.saldo);
    }
}
