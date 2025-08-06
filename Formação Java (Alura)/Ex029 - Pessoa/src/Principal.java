import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Jean", 21);
        Pessoa pessoa2 = new Pessoa("Larissa", 35);
        Pessoa pessoa3 = new Pessoa("Roberto", 50);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista listaDePessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        System.out.println("Lista de objetos: ");
        for (int i = 0; listaDePessoas.size() > i; i++) {
            System.out.println("Objeto na posição " + i + ": " + listaDePessoas.get(i).getNome());
        }
    }
}
