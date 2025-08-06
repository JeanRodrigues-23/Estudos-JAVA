package br.com.estufa.model;

public class Estufa {
    private String local;
    private double temperaturaAtual;

    public Estufa(String local, double temperaturaAtual) {
        this.local = local;
        this.temperaturaAtual = temperaturaAtual;
    }

    public void relatorioEstufa() {
        System.out.printf("""
                Sensor no local: %s
                Temperatura: %.1f ºC
                """, local, temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Temperatura acima do limite!");
        } else {
            System.out.println("Temperatura dentro do limite.");
        }
    }
}
