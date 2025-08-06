public class Login {
    private String login;
    private String senha;

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha(String tentativaSenha) {
        if (tentativaSenha.equals(this.senha)) {
            return true;
        } else {
            return false;
        }
    }
}
