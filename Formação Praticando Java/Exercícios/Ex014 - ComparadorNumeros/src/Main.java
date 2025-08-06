import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite dois números e te direi qual o maior ou se são iguais:");
        int numero1 = leitura.nextInt();
        leitura.nextLine();
        int numero2 = leitura.nextInt();
        leitura.nextLine();

        int maior;

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais!");
        }

        leitura.close();
    }
}
