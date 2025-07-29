import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o tamanho dos três lados e te direi se pode formar um triângulo:");
        int lado1 = leitura.nextInt();
        leitura.nextLine();
        int lado2 = leitura.nextInt();
        leitura.nextLine();
        int lado3 = leitura.nextInt();
        leitura.nextLine();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1) {
            System.out.println("Os lados podem formar um triângulo!");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}
