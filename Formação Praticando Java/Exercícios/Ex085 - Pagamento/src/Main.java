public class Main {
    public static void main(String[] args) {
        Pagamento cartao1 = new Cartao(250.00);
        Pagamento pix1 = new PIX(100.00);
        Pagamento boleto1 = new Boleto(550.00);

        cartao1.confirmarPagamento();
        pix1.confirmarPagamento();
        boleto1.confirmarPagamento();
    }
}
