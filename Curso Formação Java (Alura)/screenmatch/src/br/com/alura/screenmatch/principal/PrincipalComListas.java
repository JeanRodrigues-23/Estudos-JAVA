package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("Matrix", 1999);
        favorito.avalia(5);
        Filme meuFilme = new Filme("A bruxa", 2019);
        meuFilme.avalia(4);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(3);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing((Titulo::getAnoDeLancamento)));
        System.out.println("Ordenando por ano:");
        System.out.println(lista);
    }
}
