public enum CodigoErro {
    NOT_FOUND(404, "O servidor não conseguiu encontrar o rescurso solicitado."),
    BAD_REQUEST(400, "A requisição falhou localmente."),
    INTERNAL_SERVER_ERROR(500, "O servidor não conseguiu responder sua requisição.");

    private final int codigoDeErro;
    private final String descricao;

    CodigoErro(int codigoDeErro, String descricao) {
        this.codigoDeErro = codigoDeErro;
        this.descricao = descricao;
    }

    public int getCodigoDeErro() {
        return codigoDeErro;
    }

    public String getDescricao() {
        return descricao;
    }
}
