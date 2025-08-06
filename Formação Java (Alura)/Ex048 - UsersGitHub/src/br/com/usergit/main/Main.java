package br.com.usergit.main;

import br.com.usergit.exception.ErroConsultaGitHubException;
import br.com.usergit.model.Usuario;
import br.com.usergit.model.UsuarioGit;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Digite o nome de um usuário do GitHub e trarei informações sobre ele: ");
        String usuario = leitura.nextLine();

        String endereco = "https://api.github.com/users/" + usuario;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String usuarioJson = response.body();

        Gson gson = new Gson();
        UsuarioGit usuarioGit = gson.fromJson(usuarioJson, UsuarioGit.class);

        try {
            Usuario usuario1 = new Usuario(usuarioGit);
            System.out.println(usuario1);
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMensagem());
        } finally {
            System.out.println("Fim da execução do programa!");
        }

    }
}
