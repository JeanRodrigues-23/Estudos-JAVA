public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("""
                - DETALHES EBOOK -
                Titulo: %s
                Ano de publicação: %d
                Formato: %s
                """, getTitulo(), getAnoDePublicacao(), formato);
    }
}
