import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Vemelho", 2020, "Gol");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String veiculoJson = gson.toJson(veiculo);

        System.out.println(veiculoJson);

    }
}
