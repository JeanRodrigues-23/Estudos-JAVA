import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Digite seu CEP e gerarei um arquivo json com o endereço!");
        String cep = leitura.next();

        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String enderecoJson = response.body();

        FileWriter escrita = new FileWriter("endereçoCompleto.json");
        escrita.write(enderecoJson);
        escrita.close();

        System.out.println("Processo terminado!");
    }
}
