public enum Moeda {
    DOLAR(6.18),
    EURO(5.30),
    REAL(1.0);

    private final double taxaDeCambio;

    private Moeda(double taxaDeCambio) {
        this.taxaDeCambio = taxaDeCambio;
    }

    public double convertePara(double valorEmReais) {
        return valorEmReais / taxaDeCambio;
    }
}
