import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo e eu retirarei a extensão:");
        String nome = leitura.nextLine();

        int posicaoPonto = nome.lastIndexOf(".");
        String nomeFormatado = nome.substring(0, (posicaoPonto - 1));
        System.out.println(nomeFormatado);

    }
}
