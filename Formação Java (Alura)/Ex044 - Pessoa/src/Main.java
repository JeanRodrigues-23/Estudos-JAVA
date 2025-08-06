import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String pessoaJson = """
                {
                "nome": "Jean",
                "idade": 21,
                "cidade": "Brasília"
                }
                """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(pessoaJson, Pessoa.class);

        System.out.println(pessoa);
    }
}
