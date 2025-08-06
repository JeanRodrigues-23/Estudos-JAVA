public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Clean Code: A Handbook of Agile Software Craftsmanship", 2008, "Robert C. Martin");
        Revista revista1 = new Revista("IEEE Software", 2023, 5);
        Ebook ebook1 = new Ebook("Spring in Action", 2022, "PDF");

        livro1.exibirDetalhes();
        livro1.gerarCodigo();

        revista1.exibirDetalhes();
        revista1.gerarCodigo();

        ebook1.exibirDetalhes();
        ebook1.gerarCodigo();
    }
}
