import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> listaClientes = new HashMap<>();

        listaClientes.put(1, "Carlos");
        listaClientes.put(2, "Marcos");
        listaClientes.put(3, "Antonia");

        System.out.println("O nome do cliente com id igual a 2 é: " + listaClientes.get(2));
    }
}
