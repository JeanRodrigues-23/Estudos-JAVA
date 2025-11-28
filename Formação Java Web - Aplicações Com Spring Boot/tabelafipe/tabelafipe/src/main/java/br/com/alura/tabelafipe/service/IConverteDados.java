package br.com.alura.tabelafipe.service;

import java.util.List;

public interface IConverteDados {
    <T> List<T> converteDadosLista(String json, Class<T> classeDo);
}
