package br.com.alura.tabelafipe.service;

import com.fasterxml.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class ConverteDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> List<T> converteDadosLista(String json, Class<T> classe) {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(
                json,
                mapper.getTypeFactory().constructCollectionType(List.class, classe)
        );
    }

    public <T> T converteDadosObjeto(String json, Class<T> classe) {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(json, classe);
    }
}
