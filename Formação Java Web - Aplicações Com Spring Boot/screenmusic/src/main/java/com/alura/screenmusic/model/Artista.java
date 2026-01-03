package com.alura.screenmusic.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Enumerated(EnumType.STRING)
    private TipoArtista tipoArtista;
    private int decada;
    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Musica> musicas = new ArrayList<>();

    public Artista() {
    }

    public Artista(String nome, int idade, String genero, String tipoArtista, int decada) {
        this.nome = nome;
        this.idade = idade;
        this.genero = Genero.retornaGenero(genero);
        this.tipoArtista = TipoArtista.retornaTipoArtista(tipoArtista);
        this.decada = decada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDecada() {
        return decada;
    }

    public void setDecada(int decada) {
        this.decada = decada;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Artista: " +
                "nome: " + nome +
                "decada: " + decada +
                ", genero: " + genero +
                ", tipo: " + tipoArtista +
                ", idade: " + idade;
    }
}
