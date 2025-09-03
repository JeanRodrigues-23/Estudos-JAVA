import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaPalavras = Arrays.asList("Maçã", "Banana", "Uva", "Abacaxi", "Melancia");

        listaPalavras.stream()
                .map(f -> f.toUpperCase())
                .forEach(System.out::println);

        listaPalavras.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
