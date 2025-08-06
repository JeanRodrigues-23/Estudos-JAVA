public class Desconto {

    public static void main (String[] args) {

        double precoOriginal = 90.0;
        double percentualDesconto = 15;
        double precoComDesconto = precoOriginal - (precoOriginal * (percentualDesconto / 100));

        System.out.print(String.format("""
                Preço original: %.2f
                Desconto: %.0f porcento
                Preço com desconto: %.2f
                """, precoOriginal, percentualDesconto, precoComDesconto));

    }

}
