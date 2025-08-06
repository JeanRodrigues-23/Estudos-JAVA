import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(9.0);
        Quadrado q2 = new Quadrado(10.0);
        Circulo c1 = new Circulo(5.6);
        Circulo c2 = new Circulo(7.8);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(q1);
        listaDeFormas.add(q2);
        listaDeFormas.add(c1);
        listaDeFormas.add(c2);

        for(Forma item : listaDeFormas) {
            System.out.println("Área da forma: " + item.calcularArea());
        }

    }
}
