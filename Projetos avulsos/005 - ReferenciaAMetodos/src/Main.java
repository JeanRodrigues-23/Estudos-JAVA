import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String nome = "Carlos";

        Function<String, Pessoa> criador = f -> new Pessoa(nome);

        Function<String, Pessoa> criador2 = Pessoa::new;
    }
}
