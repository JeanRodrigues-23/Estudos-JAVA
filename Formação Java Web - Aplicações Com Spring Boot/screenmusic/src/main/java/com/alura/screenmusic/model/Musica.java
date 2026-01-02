package com.alura.screenmusic.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataLancamento;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @ManyToOne
    private Artista artista;

    public Musica() {
    }

    public Musica(String nome, LocalDate dataLancamento, String genero, Artista artista) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.genero = Genero.retornaGenero(genero);
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public Genero getGenero() {
        return genero;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "nome: " + nome + " - Gênero: " + genero + " - data de lançamento: " + dataLancamento + " artista: " + artista.getNome();
    }
}

