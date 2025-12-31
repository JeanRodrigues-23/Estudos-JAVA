package com.alura.screenmusic.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private LocalDate dataLancamento;
    private Genero genero;
    @ManyToOne
    private Artista artista;
}
