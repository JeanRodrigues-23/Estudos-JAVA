public class Reserva {

    public void reservar() {
        System.out.println("Reserva realizada!");
    }

    public void reservar(String data) {
        System.out.println("Reserva feita para o dia " + data);
    }

    public void reservar(String data, int qtdPessoas) {
        System.out.printf("Reserva feita para o dia %s para %d pessoas.%n", data, qtdPessoas);
    }
}
