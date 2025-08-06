import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add("João");
        listaFuncionarios.add("Maria");
        listaFuncionarios.add("Ana");
        listaFuncionarios.add("Pedro");
        listaFuncionarios.add("Antônio");

        int qtdFuncionarios = listaFuncionarios.size();

        System.out.println("A segunda pessoa da lista é: " + listaFuncionarios.get(1));
        System.out.println("Total de funcionários: " + qtdFuncionarios);
    }
}
