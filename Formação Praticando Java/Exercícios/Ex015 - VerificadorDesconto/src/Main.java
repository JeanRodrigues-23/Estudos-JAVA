import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor e te direi se tem direito ao desconto e, se sim, qual o valor final: ");
        double preco = leitura.nextDouble();
        leitura.nextLine();

        if (preco < 100) {
            System.out.println("Não é possível aplicar o desconto! Valor total: R$" + preco);
        } else {
            double precoComDesconto = preco * 0.9;
            System.out.println("Desconto de 10% aplicado! Novo valor total: R$" + precoComDesconto);
        }
    }
}
