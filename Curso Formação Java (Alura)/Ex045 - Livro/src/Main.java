import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String livroJson = """
                {
                  "titulo": "O Hobbit",
                  "autor": "J.R.R Tolkien",
                  "editora": {
                    "nome": "HarperCollinsBrasil",
                    "cidade": "São Paulo"
                  }
                }
                """;

        Editora harperCollinsBrasil = new Editora("HarperCollinsBrasil", "Rio de Janeiro – RJ, CEP 20091‑90");

        Gson gson = new Gson();
        Livro livro1 = gson.fromJson(livroJson, Livro.class);

        System.out.println(livro1);
    }
}
