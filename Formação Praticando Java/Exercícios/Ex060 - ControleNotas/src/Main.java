import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>(List.of(7.5, 8.0, 6.5, 9.0, 10.0));

        double somaNotas = notas.stream().reduce(0.0, Double::sum);
        double mediaNotas = somaNotas / notas.size();
        double menorNota = notas.stream().min(Double::compare).get();
        double maiorNota = notas.stream().max(Double::compare).get();

        System.out.printf("A média das notas é: %.2f\n", mediaNotas);
        System.out.printf("A menor nota foi: %.2f\n", menorNota);
        System.out.printf("A maior nota foi: %.2f\n", maiorNota);
    }
}
