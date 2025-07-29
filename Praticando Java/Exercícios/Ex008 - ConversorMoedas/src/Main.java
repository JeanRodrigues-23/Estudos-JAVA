import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Escreva um valor em real e te informei em dólar:");
        double real = leitura.nextDouble();

        double dolar = real / 5.25;
        System.out.printf("Conversão para dólar: %.2f", dolar);
    }
}
