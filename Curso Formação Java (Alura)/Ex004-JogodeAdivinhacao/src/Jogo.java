import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        // Roda o jogo enquanto o usuário não digitar 0
        int escolhaFim = 0;
        while (escolhaFim == 0){

            // Gera o número aleatório
            int numAleatorio = new Random().nextInt(100);
            System.out.println("""
                    ------------
                    VAMOS JOGAR!
                    ------------
                    Pensei em um número aleatório de 0 a 100 e você adivinha qual
                    é em até 5 tentativas! Pode começar!
                    """);

            // Recebe o número digitado pelo usuário e informa se acertou ou não
            for (int i = 0; i < 5; i++) {
                System.out.println(String.format("Tentativa número %d!", i + 1));
                int numPensado = leitura.nextInt();

                if (numPensado == numAleatorio) {
                    System.out.println("EXATAMENTE! O número que pensei foi " + numAleatorio);
                    break;
                } else {
                    System.out.println("Que pena, você errou!");
                    if (numPensado < numAleatorio) {
                        System.out.println("O número digitado é MENOR que o que eu pensei!");
                    } else {
                        System.out.println("O número digitado é MAIOR que o que eu pensei!");
                    }
                }

                if (i == 4 && numAleatorio != numPensado) {
                    System.out.println(String.format("""
                            Você gastou todas as suas tentativas!
                            O número que eu havia pensado foi %d. 
                            --------------------------------------
                            """, numAleatorio));
                }
            }
            System.out.println("""
                            Pressione 0 para jogar novamente
                            Pressione 1 para sair.
                            """);
            escolhaFim = leitura.nextInt();
        }
        // Agradecimento
        System.out.println("Obrigado por jogar!");
    }
}
