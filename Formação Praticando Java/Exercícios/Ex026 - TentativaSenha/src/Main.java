import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Digite sua senha:");
        int senhaDigitada = leitura.nextInt();
        leitura.nextLine();

        int senhaCorreta = 12345;

        for (int i = 0; i < 4; i++) {
            if (senhaCorreta == senhaDigitada) {
                System.out.println("Acesso liberado! Seja bem-vindo!");
                break;
            } else if (i < 2) {
                System.out.println("Senha inválida! Você tem " + (2 - i) + " tentativas restantes!");
                System.out.println("Digite sua senha:");
                senhaDigitada = leitura.nextInt();
                leitura.nextLine();
            } else if (i == 3) {
                System.out.println("Conta bloqueada temporariamente");
            }
        }
        leitura.close();

    }
}
