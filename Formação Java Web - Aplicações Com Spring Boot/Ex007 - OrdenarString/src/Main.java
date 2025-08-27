import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaPalavras = Arrays.asList("Jorge", "Gustavo", "Guto", "Wind", "Saulo", "Antonieta");
        listaPalavras.sort((a, b) -> a.compareTo(b));
        System.out.println(listaPalavras.toString());
    }
}
