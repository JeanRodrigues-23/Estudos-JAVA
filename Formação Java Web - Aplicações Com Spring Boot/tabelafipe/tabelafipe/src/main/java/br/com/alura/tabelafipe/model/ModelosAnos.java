package br.com.alura.tabelafipe.model;

import org.springframework.boot.Banner;

import java.util.List;

public record ModelosAnos(List<Modelos> modelos,
                          List<Anos> anos) {
}
