import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Digite a chave de acesso e o nível de permissão para acessar:");
        int codigoDeAcesso = leitura.nextInt();
        leitura.nextLine();
        int nivelDePermissao = leitura.nextInt();
        leitura.nextLine();

        boolean codigoDeAcessoEhValido;
        boolean nivelDepermissaoEhValido;

        if (codigoDeAcesso == 2023) {
            codigoDeAcessoEhValido = true;
        } else {
            codigoDeAcessoEhValido = false;
        }

        if (nivelDePermissao == 1 || nivelDePermissao == 2 || nivelDePermissao == 3) {
            nivelDepermissaoEhValido = true;
        } else {
            nivelDepermissaoEhValido = false;
        }

        if (codigoDeAcessoEhValido && nivelDepermissaoEhValido) {
            System.out.println("Acesso liberado! Seja bem vindo!");
        } else {
            System.out.println("Acesso negado! Motivos:");
            if (!codigoDeAcessoEhValido) {
                System.out.println("Codigo de acesso inválido!");
            }
            if (!nivelDepermissaoEhValido) {
                System.out.println("Nível de permissão negado!");
            }
        }
    }
}
