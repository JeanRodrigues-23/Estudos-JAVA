public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double c = (fahrenheit - 32) / 1.8;
        System.out.println(String.format("A temperatura em Celsius é: %.2f", c));
    }

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double f = celsius * 1.8 + 32;
        System.out.println(String.format("A temperatura em Fahrenheit é: %.2f", f));
    }
}
