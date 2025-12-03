import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"


    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {

        String[] nomes = nomeCompleto.trim().split(" ");
        if (nomes.length == 1) {
            return nomes[0];
        }
        return nomes[0] + " " + nomes[nomes.length - 1];

    }

}