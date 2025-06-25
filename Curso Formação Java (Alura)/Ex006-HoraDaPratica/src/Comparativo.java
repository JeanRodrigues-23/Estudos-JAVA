import java.util.Scanner;

public class Comparativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Recebe os dois números digitados
        System.out.println("Digite dois números inteiros e irei compará-los!");
        System.out.println("Digite o primeiro número:");
        int primeiroNum = leitura.nextInt();
        System.out.println("Digite o segundo número:");
        int segundoNum = leitura.nextInt();

        // Compara e apresenta os números
        if (primeiroNum == segundoNum) {
            System.out.println("Os números são iguais!");
        } else if (primeiroNum > segundoNum) {
                System.out.println("São diferentes e o primeiro é maior que o segundo!");
        } else {
            System.out.println("São diferentes e o primeiro é menor que o segundo!");
        }
    }
}
