public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoDePublicacao, int edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("""
                - DETALHES REVISTA -
                Titulo: %s
                Ano de publicação: %d
                Edição: %d
                """, getTitulo(), getAnoDePublicacao(), edicao);
    }
}
