import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(f -> f.toUpperCase())
                .forEach(System.out::println);

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        num.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.println(n * 2));

        List<String> palav = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> palavrasDiferentes = palav.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(palavrasDiferentes);

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> listaResumida = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(Main::ehPrimo)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listaResumida);

        }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
