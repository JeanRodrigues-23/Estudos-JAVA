public class ContaBancaria {
    protected double saldo;
    private double tarifaMensal;

    public double getSaldo() {
        return this.saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return this.tarifaMensal;
    }

    public void depositar(double valorDepositado) {
        this.saldo += valorDepositado;
        System.out.println("Valor de R$ " + valorDepositado + " depositado!");
    }

    public void sacar (double valorDeSaque) {
        if (valorDeSaque > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valorDeSaque;
            System.out.println("Saque efetuado! Saldo atualizado: R$" + saldo);
        }
    }
}
