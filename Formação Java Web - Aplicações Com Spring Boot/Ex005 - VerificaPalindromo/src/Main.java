public class Main {
    public static void main(String[] args) {
        VerificaPalindromo verificaPalindromo = frase -> {
            StringBuilder stringBuilder = new StringBuilder(frase);
            stringBuilder.reverse();
            if (stringBuilder.toString().equalsIgnoreCase(frase)) {
                return true;
            } else {
                return false;
            }
        };

        String fraseEscrita = "Caiac";

        System.out.println(verificaPalindromo.verificarPalindromo(fraseEscrita));

    }
}
