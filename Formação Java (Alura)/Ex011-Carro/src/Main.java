public class Main {
    public static void main(String[] args) {
        Carro celta = new Carro();

        celta.modelo = "Celta";
        celta.ano = 2005;
        celta.cor = "Preto";

        celta.exibeFicha();
        System.out.println(String.format("O carro tem %d anos", celta.calculaIdade()));
    }
}
