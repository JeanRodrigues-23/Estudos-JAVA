public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A area é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (largura + altura);
        System.out.println("O perímetro é: " + perimetro);
    }

}
