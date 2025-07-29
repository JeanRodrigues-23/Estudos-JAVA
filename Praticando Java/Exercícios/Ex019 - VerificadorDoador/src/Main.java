import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Me informe sua idade e peso e te direi se está apto para doar sangue!");
        int idade = leitura.nextInt();
        leitura.nextLine();
        double peso = leitura.nextDouble();
        leitura.nextLine();

        boolean aptoPeso;
        boolean aptoIdade;

        if (idade >= 18 && idade <= 65) {
            aptoIdade = true;
        } else {
            aptoIdade = false;
        }

        if (peso > 50) {
            aptoPeso = true;
        } else {
            aptoPeso = false;
        }

        if (aptoPeso && aptoIdade) {
            System.out.println("Parabéns! Você pode doar sangue! Motivos:");
        } else {
            System.out.println("Você não pode doar sangue!");
            if (!aptoIdade) {
                System.out.println("Sua idade não atende aos requisitos.");
            }
            if (!aptoPeso) {
                System.out.println("Seu peso não atende aos requisitos.");
            }
        }

        leitura.close();
    }
}
