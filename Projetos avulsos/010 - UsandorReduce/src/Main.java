import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> palavras = List.of("Java", "Streams", "são", "poderosos");

        String fraseCompleta = palavras.stream()
                .reduce("", (frase, palavra) -> frase + (palavra + " "));

        System.out.println("A frase é: " + fraseCompleta);

    }
}
