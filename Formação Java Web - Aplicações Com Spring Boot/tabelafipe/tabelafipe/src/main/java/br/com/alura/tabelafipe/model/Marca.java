package br.com.alura.tabelafipe.model;

public record Marca(Long codigo,
                    String nome) {
    @Override
    public String toString() {
        return "Cod: " + this.codigo + " Descrição: " + this.nome;
    }
}
