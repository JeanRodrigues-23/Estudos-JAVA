import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Me informe seu nome (pelo menos 3 caracteres):");
        String nome = leitura.nextLine().trim();

        while (nome.length() < 3) {
            System.out.println("Nome inválido. Escreva um número com mais de 3 letras:");
            nome = leitura.nextLine().trim();
        }
        System.out.println("Nome registrado!");
        leitura.close();
    }
}
