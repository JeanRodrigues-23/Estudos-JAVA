import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Escreva um número e te direi se ele é par ou ímpar!");
        int numero = leitura.nextInt();
        leitura.nextLine();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR!");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR!");
        }
    }
}
