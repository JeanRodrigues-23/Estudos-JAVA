public class DolarParaReal {

    public static void main (String[] args) {

        double valorEmDolares = 10;
        double taxaDeConversao = 4.94;
        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println(String.format("O valor de %.2f doláres corresponde a %.2f reais.", valorEmDolares, valorEmReais));

    }

}
