public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new Notificacao();

        notificacao.enviarMensagem("Bom dia!");
        notificacao.enviarMensagem("Pedro", "Olá, Pedro!");
        notificacao.enviarMensagem("Maria", "Parabéns, Maria!", 5);
    }
}
