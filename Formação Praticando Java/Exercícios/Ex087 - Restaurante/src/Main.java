public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva();

        reserva.reservar();
        reserva.reservar("15/09/2025");
        reserva.reservar("20/10/2025", 5);

        Reserva reservaVip = new ReservaVip();
        reservaVip.reservar();
    }
}
