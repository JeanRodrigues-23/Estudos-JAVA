public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoDePublicacao, String autor) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("""
                - DETALHES LIVRO -
                Titulo: %s
                Ano de publicação: %d
                Autor: %s
                """, getTitulo(), getAnoDePublicacao(), autor);
    }
}
