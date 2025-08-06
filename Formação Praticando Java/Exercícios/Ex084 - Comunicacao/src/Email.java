public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.printf("""
                - Email -
                Enviado para: %s
                Assunto: %s
                Corpo: %s
                """, getDestinatario(), assunto, getMensagem());
    }
}
