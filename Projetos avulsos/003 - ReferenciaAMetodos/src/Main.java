import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaNomes = Arrays.asList("Carlos", "Ednalva", "Pedro", "Antonio", "Damasceno");

//        listaNomes.stream()
//                .sorted((a, b) -> a.compareToIgnoreCase(b))
//                .forEach(System.out::println);

        listaNomes.stream()
                .sorted(String::compareToIgnoreCase)
                .forEach(System.out::println);
    }
}
