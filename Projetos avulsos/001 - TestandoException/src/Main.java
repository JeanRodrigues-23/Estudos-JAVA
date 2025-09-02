import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Vamos somar valores positivos! Escreva dois valores: " );
        int n1 = leitura.nextInt();
        leitura.nextLine();
        int n2 = leitura.nextInt();
        leitura.nextLine();

        try {
            System.out.println("O resultado da soma é: " + Operacoes.somar(n1, n2));
        } catch (TesteException te) {
            te.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
