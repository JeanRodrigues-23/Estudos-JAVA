package br.com.biblioteca.model;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void resumoLivro() {
        System.out.printf("%s de %s tem %d páginas.", titulo, autor, paginas);
    }
}
