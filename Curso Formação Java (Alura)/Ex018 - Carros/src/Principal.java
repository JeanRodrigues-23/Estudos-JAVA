public class Principal {
    public static void main(String[] args) {
        ModeloCarro gol = new ModeloCarro();
        gol.definirModelo("Gol");
        gol.definirPrecos(18000.0, 19000.0, 20000.0);
        gol.corAnoUso("Vermelho", 2016, "Usado");

        gol.exibirInformacoes();
        gol.menorMaiorPreco();
    }

}
