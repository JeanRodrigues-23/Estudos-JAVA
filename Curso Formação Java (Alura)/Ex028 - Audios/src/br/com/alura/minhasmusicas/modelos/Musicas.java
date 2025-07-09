package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.interfaces.Exibivel;

public class Musicas extends Audio implements Exibivel {
    private String cantor;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(String.format("""
                Detalhes da faixa:
                Titulo: %s
                Duração: %s
                Total de reproduções: %d
                Curtidas: %d
                cantor: %s
                """, this.getTitulo(), this.getDuracao(), this.getTotalDeReproducoes(), this.getCurtidas(), this.getCantor()));
    }
}
