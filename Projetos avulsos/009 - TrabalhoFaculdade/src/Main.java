import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Vamos fazer matrizes! Escreva uma sequência de 12 dígitos e te direi a matriz digita e versão tranposta:");
        int[][] matrizUsuario = new int[3][4];

        for (int i = 0; i <= 2; i++) {
            System.out.println("Linha " + (i + 1));

            for (int j = 0; j <= 3; j++) {
                matrizUsuario[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        int[][] matrizTransposta = new int[4][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                matrizTransposta[j][i] = matrizUsuario[i][j];
            }
        }

        System.out.print("\nMatriz digitada:");
        for (int i = 0; i <= 2; i++) {
            System.out.println("\n");

            for (int j = 0; j <= 3; j++) {
                System.out.print(matrizUsuario[i][j] + " - ");
            }
        }

        System.out.print("\n\nMatriz transposta:");
        for (int i = 0; i <= 3; i++) {
            System.out.println("\n");

            for (int j = 0; j <= 2; j++) {
                System.out.print(matrizTransposta[i][j] + " - ");
            }
        }
    }
}
