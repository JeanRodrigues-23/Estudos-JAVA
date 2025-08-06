import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                Olá! Vou tem mostrar a cotação atual da moeda que desejar!
                Me informe a moeda que deseja informações:
                """);
        var moeda = leitura.nextLine();

        var endereco = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=" + moeda + "&x_cg_demo_api_key=";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
