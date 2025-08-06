import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Login login1 = new Login("usuario123", "123abc");

        System.out.println("Digite sua senha:");

        for (int i = 3; i > 0 ; i--) {
            String senhaTentativa = leitura.nextLine();

            if (login1.validarSenha(senhaTentativa)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else if (i - 1 != 0){
                System.out.println("Senha incorreta. Tentativas restantes: " + (i - 1));
            } else {
                System.out.println("Acesso bloqueado. Contate o administrador.");
            }
        }
        leitura.close();
    }
}
