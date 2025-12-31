package com.alura.screenmusic.repository;

import com.alura.screenmusic.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaReposotiry extends JpaRepository<Artista, Long> {
}
