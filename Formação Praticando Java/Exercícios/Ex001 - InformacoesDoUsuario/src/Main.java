import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Irei criar sua ficha de cadastro. Qual seu nome?");
        String nome = leitura.nextLine();

        System.out.println("Qual sua idade?");
        int idade = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Qual sua altura?");
        double altura = leitura.nextDouble();
        leitura.nextLine();

        System.out.println("Você é estudante? Digite SIM ou NÃO");
        String resposta = leitura.nextLine();
        boolean estuda;
        if (Objects.equals(resposta, "SIM")) {
            estuda = true;
        } else {
            estuda = false;
        }

        System.out.printf("""
                - FICHA COMPLETA -
                Nome: %s
                Idade: %d
                Altura: %.2f
                Estudante: %b\n
                """, nome, idade, altura, estuda);
    }
}
