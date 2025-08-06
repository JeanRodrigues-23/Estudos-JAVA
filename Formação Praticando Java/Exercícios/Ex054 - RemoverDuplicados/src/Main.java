import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> listaEventos = new ArrayList<>();

        listaEventos.add("IA Conference Brasil");
        listaEventos.add("AI Summit");
        listaEventos.add("DevFest");
        listaEventos.add("Cloud Expo");
        listaEventos.add("IA Conference Brasil");
        listaEventos.add("DevFest");

        Set<String> eventosUnicos = new HashSet<>(listaEventos);

        System.out.println("Lista de eventos: " + eventosUnicos);
    }
}
