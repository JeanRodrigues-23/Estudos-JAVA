import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Vamos fazer a tabuada do número que você quiser!\nDigite um número!");
        int num = leitura.nextInt();
        System.out.println("Tabuda de " + num);
        int calculo = 0;

        //Proecessamento e saída de dados
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
        }
    }
}
