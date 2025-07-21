import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                -- Pesquisador de livros --
                Digite o título de um livro:
                """);
        var tituloLivro = leitura.nextLine();

        var endereco = "https://www.googleapis.com/books/v1/volumes?q=intitle:" + tituloLivro + "&key=AIzaSyCB5yQoaC6UsGeDZb3P2JHKjhVYimPUZho";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
