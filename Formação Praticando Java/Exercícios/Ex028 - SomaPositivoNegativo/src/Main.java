import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Vamos somar números positivos e negativos!");

        String numero;
        List<Integer> listaPositivos = new ArrayList<>();
        List<Integer> listaNegativos = new ArrayList<>();
        do {
            System.out.println("Digite um número (ou fim para encerrar:)");
            numero = leitura.nextLine();

            if (!numero.equalsIgnoreCase("fim")) {
                if (Integer.parseInt(numero) >= 0) {
                    listaPositivos.add(Integer.parseInt(numero));
                } else {
                    listaNegativos.add(Integer.parseInt(numero));
                }
            }
        } while (!numero.equalsIgnoreCase("fim"));

        System.out.printf("""
                - Relatório -
                Números positivos: %d
                Números negativos: %d
                """, listaPositivos.size(), listaNegativos.size());

        leitura.close();
    }
}
