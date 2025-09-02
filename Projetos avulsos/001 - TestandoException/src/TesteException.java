public class TesteException extends Exception {
    public TesteException(String mensagem) {
        super(mensagem);
    }

    public TesteException(String mensagem, Exception causa) {
        super(mensagem, causa);
    }
}
