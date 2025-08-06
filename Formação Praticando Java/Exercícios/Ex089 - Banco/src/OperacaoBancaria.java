public abstract class OperacaoBancaria implements AcaoBancaria {
    private double valor;

    public double getValor() {
        return valor;
    }

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }
}
