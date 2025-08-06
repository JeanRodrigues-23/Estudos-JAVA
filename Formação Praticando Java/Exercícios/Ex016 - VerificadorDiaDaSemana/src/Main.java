import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Me diga um dia da semana (em minúsculo) e te direi se ele é útil ou não:");
        String dia = leitura.nextLine();

        switch (dia) {
            case "segunda":
                System.out.println("Segunda é um dia útil!");
                break;
            case "terça":
                System.out.println("Terça é um dia útil!");
                break;
            case "quarta":
                System.out.println("Quarta é um dia útil!");
                break;
            case "quinta":
                System.out.println("Quinta é um dia útil!");
                break;
            case "sexta":
                System.out.println("Sexta é um dia útil!");
                break;
            case "sábado":
                System.out.println("Sábado é um dia útil!");
                break;
            case "domingo":
                System.out.println("Domingo é um dia útil!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }

        leitura.close();
    }
}
