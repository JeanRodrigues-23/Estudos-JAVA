public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.setPrecoReal(5.45);
        conversorMoeda.setDolar(50);
        System.out.println(conversorMoeda.getDolar() + " dólares dá " + conversorMoeda.converterDolarParaReal(conversorMoeda.getDolar()) + " reais!");
    }
}
