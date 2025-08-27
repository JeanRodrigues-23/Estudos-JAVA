public class Main {
    public static void main(String[] args) {
        ConvMaiuscula convMaiuscula = (String frase) -> frase.toUpperCase();

        String fraseEscrita = "Olá! Eu sou uma frase!";
        System.out.println(fraseEscrita);
        System.out.println(convMaiuscula.converterMaiuscula(fraseEscrita));
    }
}
