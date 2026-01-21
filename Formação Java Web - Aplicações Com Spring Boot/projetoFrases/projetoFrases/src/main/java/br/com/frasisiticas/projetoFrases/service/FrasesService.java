package br.com.frasisiticas.projetoFrases.service;

import br.com.frasisiticas.projetoFrases.dto.FrasesDTO;
import br.com.frasisiticas.projetoFrases.model.Frases;
import br.com.frasisiticas.projetoFrases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private FrasesRepository frasesRepository;

    public FrasesDTO buscarFraseSerie() {
        Frases frases = frasesRepository.buscaFrasesAleatoria();
        return new FrasesDTO(frases.getTitulo(), frases.getFrase(), frases.getPersonagem(), frases.getPoster());
    }
}
