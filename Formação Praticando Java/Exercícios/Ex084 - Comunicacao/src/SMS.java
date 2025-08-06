public class SMS extends Notificacao{
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf("""
                - SMS -
                Enviando SMS para: %s
                Mensagem: %s
                """, getDestinatario(), getMensagem());
    }
}
