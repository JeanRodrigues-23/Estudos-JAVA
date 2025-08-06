import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria(123, 50.00);
        ContaBancaria c2 = new ContaBancaria(124, 69.00);
        ContaBancaria c3 = new ContaBancaria(125, 87.00);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(c1);
        listaDeContas.add(c2);
        listaDeContas.add(c3);

        ContaBancaria contaMaiorSaldo = null;
        for (ContaBancaria item : listaDeContas) {
            double maiorSaldo = 0;
            if (maiorSaldo < item.getSaldo()) {
                maiorSaldo = item.getSaldo();
                contaMaiorSaldo = item;
            }

        }
        System.out.printf("A conta com maior saldo é a de número " + contaMaiorSaldo.getNumeroDaConta() + " com saldo de " + contaMaiorSaldo.getSaldo() + " reais!");
    }
}
