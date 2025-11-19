import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor da distãncia em quilômetros a ser percorrida: ");
        double distancia = leitura.nextDouble();
        leitura.nextLine();

        boolean isChovendo;
        System.out.println("Está chovendo? (sim/nao)");
        String resposta = leitura.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            isChovendo = true;
        } else if (resposta.equalsIgnoreCase("nao")) {
            isChovendo = false;
        } else {
            throw new IllegalArgumentException("A resposta deve ser 'sim' ou 'nao'");
        }

        double taxaDeEntrega = 0;
        if (distancia <= 5) {
            taxaDeEntrega = 5.00;
        } else  if (distancia <= 10) {
            taxaDeEntrega = 8.00;
        } else if (distancia > 10) {
            taxaDeEntrega = 10.00;
        }

        if (isChovendo) {
            taxaDeEntrega += 2.00;

        }

        System.out.println("A taxa de entrega ficou " + taxaDeEntrega + " reais.");
    }
}
