package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Classificador;
import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {
        Musicas musica = new Musicas();
        musica.setTitulo("Don't Cry");
        musica.setCurtidas(51);
        musica.setDuracao(4.51);
        musica.setTotalDeReproducoes(67);
        musica.setCantor("Axl Rose");

        Podcasts podcasts = new Podcasts();
        podcasts.setCurtidas(49);
        podcasts.setDuracao(56.30);
        podcasts.setTitulo("Ao vivo com Eduardo Costa!");
        podcasts.setIntegrantes("Carlos, Eduardo e Marcela");
        podcasts.setTotalDeReproducoes(13);

        Classificador classificador = new Classificador();

        podcasts.exibirDetalhes();
        classificador.classificar(podcasts);

        musica.exibirDetalhes();
        classificador.classificar(musica);
    }
}
