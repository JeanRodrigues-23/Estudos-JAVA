public class Main {
    public static void main(String[] args) {
        Notificacao email1 = new Email("jose@gmail.com", "Favor, enivar o relatório pedido até 18h.", "Pedido de relatório");
        Notificacao sms1 = new SMS("(61) 9 9999-9999", "Oi! Tudo bem?");
        Notificacao push1 = new Push("usuario_app", "Saiba mais sobre nosso novo produto!", "Imperdível!");

        email1.enviar();
        sms1.enviar();
        push1.enviar();
    }
}
