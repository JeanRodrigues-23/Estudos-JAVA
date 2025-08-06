import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um número e te direi se ele é par ou ímpar!");
        int num = leitura.nextInt();

        // Processamento e saída de dados
        if (num % 2 == 0) {
            System.out.println("O número digitado é par!");
        } else {
            System.out.println("O número digitado é ímpar!");
        }
    }
}
