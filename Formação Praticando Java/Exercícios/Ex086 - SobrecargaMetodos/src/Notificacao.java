public class Notificacao {
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.printf("Mensagem para %s: %s%n", destinatario, mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem, int quantidadeMensagens) {
        for (int i = 0; i < quantidadeMensagens; i++) {
            System.out.printf("Mensagem para %s: %s%n", destinatario, mensagem);
        }
    }
}
