package br.com.teste.aplicacao;

import br.com.teste.exception.minimoCaracteresSenhaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Vamos criar uma senha! Pode digitar");

        try {
            String senha = leitura.nextLine();
            if (senha.length() < 8) {
                throw new minimoCaracteresSenhaException("Senha inválida. A senha deve conter no mínimo 8 caracteres.");
            }
        } catch (minimoCaracteresSenhaException e) {
            System.out.println(e.getMessage());
        }
    }
}