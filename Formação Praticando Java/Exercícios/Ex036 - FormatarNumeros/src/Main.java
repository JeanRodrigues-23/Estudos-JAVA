import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número com várias casas decimais e arredondarei para 2 casas decimais:");
        double numero = leitura.nextDouble();

        System.out.printf("Número com 2 casas decimais: %.2f", numero);
    }
}
