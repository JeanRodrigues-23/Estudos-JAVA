public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.printf("""
                - PUSH -
                Enviando push para: %s
                Titulo: %s
                Conteúdo: %s
                """, getDestinatario(), titulo, getMensagem());
    }
}
