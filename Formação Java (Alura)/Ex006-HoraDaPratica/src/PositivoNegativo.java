import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um número inteiro e direi se é positivo ou negativo!");
        int numero = leitura.nextInt();

        // Processamento e saída de dados
        if (numero >= 0) {
            System.out.println("O número digitado é POSITIVO!");
        } else {
            System.out.println("O número digitado é NEGATIVO!");
        }
    }
}
