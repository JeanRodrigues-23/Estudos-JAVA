import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um texto com hashtags e te informarei todas as hashtags usadas:");
        String texto = leitura.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        List<String> hashtags = new ArrayList<>();

        while (matcher.find()) {
            hashtags.add(matcher.group());
        }

        if (hashtags == null || hashtags.isEmpty()) {
            System.out.println("Não há hashtags no texto!");
        } else {
            System.out.println("Lista de hashtags: " + String.join(", ", hashtags));
        }

        leitura.close();
    }
}
