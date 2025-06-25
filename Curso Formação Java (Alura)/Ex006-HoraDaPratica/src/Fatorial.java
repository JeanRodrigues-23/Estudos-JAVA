import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um número e informarei seu fatorial:");
        int num = leitura.nextInt();
        int salvamentoNum = num;

        // Processamento de dados
        for (int i = num; i > 1; i--) {
            num *= (i - 1);
        }

        // Saída de dados
        System.out.println(String.format("O fatorial de %d é %d", salvamentoNum, num));
    }
}
