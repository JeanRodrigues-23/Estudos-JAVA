public class TesteException extends RuntimeException{
    public TesteException(String mensagem) {
        super(mensagem);
    }

    public TesteException(String mensagem, Throwable causa) {

    }
}
