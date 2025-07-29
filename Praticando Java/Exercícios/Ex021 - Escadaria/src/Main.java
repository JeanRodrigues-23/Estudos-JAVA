import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Narrarei você subindo os degraus. Quantos degraus deseja subir?");
        int qtdDegraus = leitura.nextInt();
        leitura.nextLine();

        for (int i = 1; i <= qtdDegraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao topo!");

        leitura.close();
    }
}
