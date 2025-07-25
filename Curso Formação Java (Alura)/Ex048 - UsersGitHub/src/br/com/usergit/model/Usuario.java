package br.com.usergit.model;

import br.com.usergit.exception.ErroConsultaGitHubException;

public class Usuario {
    private String nome;
    private String url;
    private String login;
    private int public_repos;

    public Usuario(UsuarioGit usuarioGit) {
        if (usuarioGit.name() == null) {
            throw new ErroConsultaGitHubException("Usuário não encontrado!");
        }

        this.nome = usuarioGit.name();
        this.url = usuarioGit.url();
        this.login = usuarioGit.login();
        this.public_repos = usuarioGit.public_repos();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Login: " + login + " - Repositórios públicos: " + public_repos + " - URL: " + url;
    }
}
