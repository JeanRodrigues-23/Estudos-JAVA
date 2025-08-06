package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.interfaces.Exibivel;

public class Audio implements Exibivel {
    private String Titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
        System.out.println("A música está rolando!");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(String.format("""
                Detalhes da faixa:
                Titulo: %s
                Duração: %s
                Total de reproduções: %d
                Curtidas: %d
                """, this.getTitulo(), this.getDuracao(), this.getTotalDeReproducoes(), this.getCurtidas()));
    }

}
