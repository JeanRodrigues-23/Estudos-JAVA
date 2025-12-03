public class Main {
    public static void main(String[] args) {
        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false



    }
    public static boolean ehPalindromo(String palavra) {
        String palavraSemEspacos = palavra.replace(" ", "");
        String palavraInvertida = String.valueOf(new StringBuilder(palavraSemEspacos.trim()).reverse());
        return palavraSemEspacos.trim().equalsIgnoreCase(palavraInvertida);
    }
}