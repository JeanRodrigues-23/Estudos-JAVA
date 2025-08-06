import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listaFuncionarios = new ArrayList<>(List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline"));

        List<String> funcionariosMax5Caracteres = listaFuncionarios.stream().filter(f -> f.length() <= 5).collect(Collectors.toList());

        System.out.println("Lista de funcionários com nome de até 5 caracteres: " + funcionariosMax5Caracteres);
    }
}
