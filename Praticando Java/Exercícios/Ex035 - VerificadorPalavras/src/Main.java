import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Me dê uma palavra e um texto e te direi se a palavra existe no texto:");
        String texto = leitura.nextLine();
        String palavra = leitura.nextLine();

        if (texto.contains(palavra)) {
            System.out.println("A palavra existe no texto!");
        } else {
            System.out.println("A palavra não existe no texto!");
        }
    }
}
