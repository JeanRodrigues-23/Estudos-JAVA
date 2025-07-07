public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.abanarORabo();
        gato.ronronar();
        cachorro.emitirSom();

        cachorro.setNome("Peludinho");
        System.out.println(cachorro.getNome());

        gato.setNome("Bolinha");
        System.out.println(gato.getNome());
    }
}
