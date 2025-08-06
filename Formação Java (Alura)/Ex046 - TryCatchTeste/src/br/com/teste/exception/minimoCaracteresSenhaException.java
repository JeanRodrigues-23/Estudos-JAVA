package br.com.teste.exception;

public class minimoCaracteresSenhaException extends RuntimeException {
    private String mensagem;

    public minimoCaracteresSenhaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
