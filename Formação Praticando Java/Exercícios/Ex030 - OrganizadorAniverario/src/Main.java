import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome;
        List<String> listaNomes = new ArrayList<>();
        do {
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
            nome = leitura.nextLine().trim();

            if (nome.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + listaNomes);
            } else if (listaNomes.contains(nome)) {
                System.out.println("O nome " + nome + " já está na lista de convidados!");
            } else if (!listaNomes.contains(nome)) {
                listaNomes.add(nome);
                System.out.println(nome + " foi adicionado(a) à lista de convidados!");
            }
        } while (!nome.equalsIgnoreCase("sair"));

        System.out.println("Programa finalizado!");
        leitura.close();
    }
}
