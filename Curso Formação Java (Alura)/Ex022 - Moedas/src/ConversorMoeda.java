public class ConversorMoeda implements ConversaoFinanceira{
    private double precoReal;
    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getPrecoReal() {
        return precoReal;
    }

    public void setPrecoReal(double precoReal) {
        this.precoReal = precoReal;
    }

    @Override
    public double converterDolarParaReal(double dolar) {
        this.dolar = dolar;
        return dolar * precoReal;
    }

}
