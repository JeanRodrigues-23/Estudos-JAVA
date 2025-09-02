public class Main {
    public static void main(String[] args) {
        int y = 4;
        if (y < 5) {
            throw new TesteException("Essa é uma mensagem inserida ao lançar o TesteException");
        }
    }
}
