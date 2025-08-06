package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.interfaces.Exibivel;

public class Podcasts extends Audio implements Exibivel {
    private String integrantes;

    public String getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(String.format("""
                Detalhes da faixa:
                Titulo: %s
                Duração: %s
                Total de reproduções: %d
                Curtidas: %d
                Integrantes: %s
                """, this.getTitulo(), this.getDuracao(), this.getTotalDeReproducoes(), this.getCurtidas(), this.getIntegrantes()));
    }
}
