package br.com.frasisiticas.projetoFrases.repository;

import br.com.frasisiticas.projetoFrases.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FrasesRepository extends JpaRepository<Frases, Long> {
        @Query("SELECT f FROM Frases f ORDER BY RANDOM() LIMIT 1")
        public Frases buscaFrasesAleatoria();
}
