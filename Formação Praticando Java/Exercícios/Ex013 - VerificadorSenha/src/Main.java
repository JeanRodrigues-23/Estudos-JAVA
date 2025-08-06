import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua senha para acessar o sistema:");
        int senhaDigitada = leitura.nextInt();
        leitura.nextLine();

        int senhaCorreta = 123456;

        if (senhaDigitada == senhaCorreta) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Senha incorreta. Acesso negado!");
        }

        leitura.close();
    }
}
