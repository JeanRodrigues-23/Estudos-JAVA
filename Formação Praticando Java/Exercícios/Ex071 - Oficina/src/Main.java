public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Gol", "ABC-1234", 2020);

        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Ano: " + carro1.getAno());
    }
}
