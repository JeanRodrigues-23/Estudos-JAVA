package com.contador.programa.model;

import java.util.List;

public class Avaliacao<T> {
    private T avaliado;
    private double nota;
    private String comentario;

    public Avaliacao(T avaliado, double nota, String comentario) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.avaliado = avaliado;
        this.nota = nota;
        this.comentario = comentario;
    }

    public T getAvaliado() {
        return avaliado;
    }

    public void setAvaliado(T avaliado) {
        this.avaliado = avaliado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public static <T> double calcularMediaNotas(List<Avaliacao<T>> avaliacoes) {
        if (avaliacoes.isEmpty()) {
            throw new IllegalArgumentException("A lista de avaliações está vazia!");
        }
        double soma = 0;
        for (Avaliacao<T> item : avaliacoes) {
            soma += item.getNota();
        }
        return soma / avaliacoes.size();
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "item=" + avaliado +
                ", nota=" + nota +
                ", comentario='" + comentario +'\'' +
                '}';
    }
}
