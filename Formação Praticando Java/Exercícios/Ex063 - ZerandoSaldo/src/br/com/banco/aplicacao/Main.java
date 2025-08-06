package br.com.banco.aplicacao;

import br.com.banco.model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1512.00);

        conta1.exibirSaldo();
        conta1.zerarSaldo();
        conta1.exibirSaldo();
    }

}
