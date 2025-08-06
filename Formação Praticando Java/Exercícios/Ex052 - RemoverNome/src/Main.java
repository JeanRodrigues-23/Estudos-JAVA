import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaAlunos = new ArrayList<>();

        listaAlunos.add("Joana");
        listaAlunos.add("Lucas");
        listaAlunos.add("Pedro");
        listaAlunos.add("Antônio");

        listaAlunos.remove(2);

        System.out.println("Lista de alunos: " + listaAlunos);
    }
}
