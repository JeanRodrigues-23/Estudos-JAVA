package br.com.alura.tabelafipe.model;

public record Modelos(Long codigo,
                      String nome) {
    @Override
    public String toString() {
        return "Cod: " + this.codigo + " Descrição: " + this.nome;
    }
}
