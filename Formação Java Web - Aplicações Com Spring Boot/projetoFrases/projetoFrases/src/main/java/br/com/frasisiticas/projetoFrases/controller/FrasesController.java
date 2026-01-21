package br.com.frasisiticas.projetoFrases.controller;

import br.com.frasisiticas.projetoFrases.dto.FrasesDTO;
import br.com.frasisiticas.projetoFrases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {
    @Autowired
    private FrasesService frasesService;

    @GetMapping("/series/frases")
    public FrasesDTO buscarFraseSerie() {
        return frasesService.buscarFraseSerie();
    }
}
