public class Relatorio implements Imprimivel{
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public void imprimir() {
        System.out.printf("""
                - RELATÓRIO -
                Titulo: %s
                Conteúdo: %s
                """, titulo, conteudo);
    }
}
