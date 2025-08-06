import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um CPF e te informarei se ele se encontra no padrão correto:");
        String CPF = leitura.nextLine().trim();

        Pattern pattern = Pattern.compile("^\\d{3}.\\d{3}.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(CPF);

        if (matcher.matches()) {
            System.out.println("CPF no formato correto!");
        } else {
            System.out.println("CPF no formato incorreto!");
        }

        leitura.close();
    }
}
