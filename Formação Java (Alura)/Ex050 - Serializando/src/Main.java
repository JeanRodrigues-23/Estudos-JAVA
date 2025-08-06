import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Homem de ferro", 2025, "Brasília", true);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String tituloJson = gson.toJson(titulo);
        System.out.println(tituloJson);
    }
}
