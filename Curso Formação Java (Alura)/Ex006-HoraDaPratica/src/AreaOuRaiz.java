import java.util.Scanner;

public class AreaOuRaiz {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Escolha da forma geométrica
        System.out.println("""
                --- MENU ---
                1. Calcular área do quadrado
                2. Calcular área do circulo
                Escolha uma opção:
                """);
        int escolha = leitura.nextInt();

        if (escolha == 1) {
            System.out.println("Você escolheu quadrado!\nDigite o valor da base:");
            int base = leitura.nextInt();
            System.out.println("Digite o valor da altura:");
            int altura = leitura.nextInt();
            int area = base * altura;
            System.out.println("A área é igual a " + area);
        } else if (escolha == 2) {
            System.out.println("Você escolheu circulo!\nDigite o valor do raio:");
            double raio = leitura.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);
            System.out.println(String.format("A área é igual a %.2f", area));
        } else {
            System.out.println("O valor digitado não corresponde a nenhuma opção.");
        }
    }
}
