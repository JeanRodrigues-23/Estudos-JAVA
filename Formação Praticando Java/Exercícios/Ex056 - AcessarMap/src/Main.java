import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> listaClientes = new HashMap<>();

        listaClientes.put(1, "Maria");
        listaClientes.put(2, "Marcos");
        listaClientes.put(3, "Ana");
        listaClientes.put(4, "Joana");
        listaClientes.put(5, "Karen");

        int solicitacaoAcesso = 6;

        if (listaClientes.containsKey(solicitacaoAcesso)) {
            System.out.println("O nome do cliente com ID " + solicitacaoAcesso + " é: " + listaClientes.get(solicitacaoAcesso));
        } else {
            System.out.println("Cliente com id " + solicitacaoAcesso + " não econtrado.");
        }
    }
}
