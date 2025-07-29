import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor que deseja para impréstimo e te direi se é possível:"); // Será liberado se estiver no intervalo de 1000 a 5000
        double valor = leitura.nextDouble();
        leitura.nextLine();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("Empréstimo liberado!");
        } else {
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido.");
        }

        leitura.close();
    }
}
