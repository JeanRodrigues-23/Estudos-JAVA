import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> precoProdutos = new ArrayList<>(List.of(29.99, 49.50, 15.75, 99.99));
        double totalPreco = precoProdutos.stream().reduce(0.0, Double::sum);
        double totalComImposto = totalPreco * 1.08;

        System.out.printf("Valor total antes do imposto: %.2f", totalPreco);
        System.out.printf("\nValor total com imposto: %.2f", totalComImposto);
    }
}
