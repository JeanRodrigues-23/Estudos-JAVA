import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um nome e te entregarei ele com todas as letras e maísculo e minúsculo:");
        String nome = leitura.nextLine();

        System.out.println("Minúsculo: " + nome.toLowerCase());
        System.out.printf("Maiúsculo: " + nome.toUpperCase());
    }
}
