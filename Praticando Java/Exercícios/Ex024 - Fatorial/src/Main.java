import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Digite um número e te direi o fatorial dele:");
        int numero = leitura.nextInt();
        leitura.nextLine();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        leitura.close();
    }
}
