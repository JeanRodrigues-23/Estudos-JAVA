import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Vamos converter temperaturas! Digite a temperatura em Celsius: ");
        double Celsius = leitura.nextDouble();
        leitura.nextLine();

        double Fahrenheit = (Celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);
    }
}
