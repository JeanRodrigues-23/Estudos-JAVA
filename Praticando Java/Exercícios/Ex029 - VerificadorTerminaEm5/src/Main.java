import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Digite um número e te direi todos os seus antecessores até 0 (mas sem os que terminam em 5):");
        int numero = leitura.nextInt();
        leitura.nextLine();

        for (int i = 1; i <= numero; i++) {
            if (i % 10 != 5) {
                System.out.print(i + " ");
            }
        }

        leitura.close();
    }
}
