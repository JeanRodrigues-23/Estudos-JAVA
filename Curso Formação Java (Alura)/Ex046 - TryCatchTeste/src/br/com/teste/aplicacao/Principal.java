package br.com.teste.aplicacao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Vamos dividir números! Digite dois valores:");
        int x = leitura.nextInt();
        int y = leitura.nextInt();

        try {
            int resultado = x / y;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível divisão por zero.");
        } finally {
            System.out.println("Codigo finalizado!");
        }

    }
}
