public class Midia {
    private String titulo;
    private int anoDePublicacao;

    public Midia(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void gerarCodigo() {
        String tresPrimeirosTitulo = titulo.substring(0, 3);
        System.out.println("LIB-" + tresPrimeirosTitulo + anoDePublicacao);
    }

    public void exibirDetalhes() {
        System.out.printf("""
                - DETALHES -
                Titulo: %s
                Ano de publicação: %d
                """, titulo, anoDePublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
}
