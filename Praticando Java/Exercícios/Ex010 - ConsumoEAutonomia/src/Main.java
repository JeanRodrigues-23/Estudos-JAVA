import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Vou fazer algumas perguntas sobre seu carro e em seguida te entregar o relatório sobre.");
        System.out.println("Qual o consumo médio do seu carro?");
        double consumoMedio = leitura.nextDouble();
        leitura.nextLine();
        System.out.println("Qual a capacidade total do seu tanque?");
        double capacidadeCombustivel = leitura.nextDouble();
        leitura.nextLine();
        System.out.println("Qual a quantidade de combustível disponível no momento?");
        double tanqueAtual = leitura.nextDouble();
        leitura.nextLine();
        System.out.println("Qual a ditância da viagem que deseja fazer?");
        double distanciaVigem = leitura.nextDouble();
        leitura.nextLine();

        double autonomiaMaxima = consumoMedio * capacidadeCombustivel;
        double autonomiaAtual = consumoMedio * tanqueAtual;

        System.out.printf("""
                A autonomia máxima do veículo é de: %.2f km
                A autonomia atual do veículo é de: %.2f km
                """, autonomiaMaxima, autonomiaAtual);

        if (autonomiaAtual > distanciaVigem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Você não conseguirá completar a viagem sem precisar abastecer.");
        }

    }
}
