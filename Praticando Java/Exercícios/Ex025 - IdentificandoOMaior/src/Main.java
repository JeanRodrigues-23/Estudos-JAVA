import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Digite uma sequência de números separados por espaço e te direi qual o maior deles:");
        String[] numeros = leitura.nextLine().split(" ");

        int maior = 0;
        List<Integer> listaInt = new ArrayList<>();
        for (String item : numeros) {
            if (maior < Integer.parseInt(item)) {
                maior = Integer.parseInt(item);
            }
        }
        System.out.println("O maior item da lista é: " + maior);
        leitura.close();
    }
}
