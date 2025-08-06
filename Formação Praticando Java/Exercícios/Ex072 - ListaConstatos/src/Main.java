import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> listaContatos = new ArrayList<>();

        listaContatos.add(new Contato("João Silva", "(11) 99999-0000"));
        listaContatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        listaContatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("Lista de contatos:");
        for(int i = 0; i < listaContatos.size(); i++) {
            System.out.println((i + 1) + ". " + listaContatos.get(i).getNome() + " - " + listaContatos.get(i).getNumero());
        }
    }
}
