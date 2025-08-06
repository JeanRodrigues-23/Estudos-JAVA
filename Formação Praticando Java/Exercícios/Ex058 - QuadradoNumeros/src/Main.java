import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> ListaNumeros = new ArrayList<>(List.of(2, 3, 5, 7, 11));

        List<Integer> quadradoListaNumeros = ListaNumeros.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println(quadradoListaNumeros);
    }
}
