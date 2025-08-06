import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Vamos calcular a média de três notas. Pode digitar:");
        double nota1 = leitura.nextDouble();
        leitura.nextLine();
        double nota2 = leitura.nextDouble();
        leitura.nextLine();
        double nota3 = leitura.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média das notas é: %.2f", media);
    }
}
