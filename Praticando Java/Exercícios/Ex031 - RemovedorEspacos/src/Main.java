import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Digite um nome com espaços no início e fim e te mostrarei sem espaços:");
        String nome = leitura.nextLine().trim();
        System.out.printf(nome);

        leitura.close();
    }
}
