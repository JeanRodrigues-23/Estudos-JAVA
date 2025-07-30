import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um código e te informarei se o mesmo está no formato correto:");
        String codigo = leitura.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigo);

        if(matcher.matches()) {
            System.out.println("O código segue o padrão correto!");
        } else {
            System.out.println("O código não segue o padrão correto!");
        }

        leitura.close();
    }
}
