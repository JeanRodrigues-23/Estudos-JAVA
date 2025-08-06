package br.com.biblioteca.model;

public class Livro {
    private String titulo;
    private int diasDeAtraso;

    public Livro(String titulo, int diasDeAtraso) {
        this.titulo = titulo;
        this.diasDeAtraso = diasDeAtraso;
    }

    public double multaAtraso() {
        double multaPorDiaAtrasado = 2.5;
        return diasDeAtraso * multaPorDiaAtrasado;
    }

    public void exibirDetalhes() {
        System.out.printf("Titulo: %s | Multa por %d dias de atraso: %.2f", this.titulo, this.diasDeAtraso, multaAtraso());
    }
}
