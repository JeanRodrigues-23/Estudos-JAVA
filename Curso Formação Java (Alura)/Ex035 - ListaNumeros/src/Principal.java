import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(2);
        listaNumeros.add(1);
        listaNumeros.add(4);
        listaNumeros.add(3);
        listaNumeros.add(7);
        listaNumeros.add(5);

        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);

    }
}
