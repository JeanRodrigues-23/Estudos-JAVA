package br.com.alura.minhasmusicas.modelos;

public class Classificador {
    public void classificar(Audio audio) {
        if (audio.getCurtidas() > 50) {
            System.out.println("Essa faixa é destaque entre os ouvintes!");
        } else {
            System.out.println("Essa é uma faixa razoável!");
        }
    }
}
