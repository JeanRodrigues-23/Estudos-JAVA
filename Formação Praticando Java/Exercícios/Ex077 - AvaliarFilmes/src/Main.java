public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("A Freira");

        filme1.adicionarAvaliacao(4);
        filme1.adicionarAvaliacao(3);
        filme1.adicionarAvaliacao(5);
        filme1.adicionarAvaliacao(3);
        filme1.adicionarAvaliacao(2);

        System.out.printf("Media de avaliações para %s: %.2f%n", filme1.getTitulo(), filme1.mediaAvaliacoes());
    }
}
