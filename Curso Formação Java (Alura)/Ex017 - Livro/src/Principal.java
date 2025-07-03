public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setAutor("João Bezerra");
        livro1.setTitulo("O Punhado Que Faltava");

        Livro livro2 = new Livro();
        livro2.setAutor("Marcos Silva");
        livro2.setTitulo("O Rio");

        Livro livro3 = new Livro();
        livro3.setAutor("Catarina Fonseca");
        livro3.setTitulo("Quando O Mal Se Esconde");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        livro3.exibirDetalhes();

    }
}
