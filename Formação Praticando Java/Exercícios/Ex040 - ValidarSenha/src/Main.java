import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                Digite uma senha e irei validá-la
                Requisitos:
                - 8 caracteres
                - Uma letra maiúscula
                - Uma letra minúscula
                - Um número
                - Um caractere especial
                """);
        String senha = leitura.nextLine().trim();

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Matcher matcher = pattern.matcher(senha);

        if (matcher.matches()) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
        }

        leitura.close();
    }
}
