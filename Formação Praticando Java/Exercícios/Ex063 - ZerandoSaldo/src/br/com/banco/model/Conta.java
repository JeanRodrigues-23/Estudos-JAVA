package br.com.banco.model;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void zerarSaldo() {
        this.saldo = 0.0;
        System.out.printf("Saldo zerado!%n");
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: %.2f%n", saldo);
    }
}
