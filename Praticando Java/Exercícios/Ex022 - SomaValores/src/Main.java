public class Main {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};

        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma = soma + valores[i];
        }

        System.out.println("A soma total das receitas é: " + soma);
    }
}
