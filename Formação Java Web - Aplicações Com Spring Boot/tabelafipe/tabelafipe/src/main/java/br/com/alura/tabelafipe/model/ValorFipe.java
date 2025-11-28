package br.com.alura.tabelafipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ValorFipe(@JsonAlias("Valor") String valor,
                        @JsonAlias("Marca") String marca,
                        @JsonAlias("Modelo") String modelo,
                        @JsonAlias("AnoModelo") Long anoModelo,
                        @JsonAlias("Combustivel") String combustivel,
                        @JsonAlias("CodigoFipe") String codigoFipe,
                        @JsonAlias("MesReferencia") String mesReferencia) {
}
