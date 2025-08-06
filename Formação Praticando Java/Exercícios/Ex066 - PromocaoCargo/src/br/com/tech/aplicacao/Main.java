package br.com.tech.aplicacao;

import br.com.tech.model.Colaborador;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("Júlia Oliveira", "Pessoa Desenvolvedora Júnior", 1);

        colaborador1.promocao("Pessoa Desenvolvedora Plena", 2);
    }
}
