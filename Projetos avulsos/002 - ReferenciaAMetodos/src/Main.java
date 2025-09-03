import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaNomes = Arrays.asList("Mateus", "Carlos", "Gustavo", "Ana", "Diana");

        // listaNomes.forEach(n -> System.out.println(n));

        listaNomes.forEach(System.out::println);
    }
}
