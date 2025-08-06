package br.com.estufa.aplicacao;

import br.com.estufa.model.Estufa;

public class Main {
    public static void main(String[] args) {
        Estufa estufa1 = new Estufa("Local A", 38);
        estufa1.relatorioEstufa();
    }
}
