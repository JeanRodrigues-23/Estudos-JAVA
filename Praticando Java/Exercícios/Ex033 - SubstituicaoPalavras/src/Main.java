import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Me escreva um texto, uma palavra a ser substituída e a palavra que ira substituí-la:");
        String texto = leitura.nextLine();
        String palavraAntiga = leitura.nextLine();
        String palavraNova = leitura.nextLine();

        Pattern pattern = Pattern.compile(palavraAntiga);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            System.out.println("Texto modificado: " + texto.replace(palavraAntiga, palavraNova));
        } else {
            System.out.println("Palavra não encontrada!");
        }

        leitura.close();
    }
}
