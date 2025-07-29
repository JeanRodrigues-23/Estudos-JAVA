import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Me informe sua média de notas e te informarei o status de aprovação:");
        double media = leitura.nextDouble();
        leitura.nextLine();

        if (media >= 7) {
            System.out.println("O estudante teve a média " + media + " e foi APROVADO!");
        } else if (media >= 5.0) {
            System.out.println("O estudante teve a média " + media + " e está de RECUPERAÇÃO!");
        } else {
            System.out.println("O estudante teve a média " + media + " e está de REPROVADO!");
        }
    }
}
