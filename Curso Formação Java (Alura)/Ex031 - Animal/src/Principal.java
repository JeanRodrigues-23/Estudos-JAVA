public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Terra", "Salsicha");
        Animal animal = new Cachorro("Terra", "Salsicha");

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um cachorro.");
        }
    }
}
