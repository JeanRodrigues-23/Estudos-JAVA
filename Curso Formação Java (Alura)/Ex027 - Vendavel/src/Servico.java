public class Servico implements Vendavel{
    private double precoHora;
    private int horas;

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public void calculaTotal() {
        double total = precoHora * horas;
        System.out.println("O valor a ser pago é de: R$" + total);
    }

    @Override
    public void aplicaDescontos() {
        double total = precoHora * horas;
        total *= 0.90;
        System.out.println("O valor a ser pago é de: R$" + total);
    }
}
