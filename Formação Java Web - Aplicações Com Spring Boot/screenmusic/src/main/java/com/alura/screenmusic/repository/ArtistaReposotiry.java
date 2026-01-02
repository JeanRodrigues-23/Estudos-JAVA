package com.alura.screenmusic.repository;

import com.alura.screenmusic.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ArtistaReposotiry extends JpaRepository<Artista, Long> {

    @Query
    Optional<Artista> findByNomeContainingIgnoreCase(String nome);
}
