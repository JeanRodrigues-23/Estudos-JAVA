import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";
        LocalTime horaTarefa = LocalTime.now();
        LocalDate dataTarefa = LocalDate.now();

        System.out.printf("""
                - TAREFA -
                %s
                """, tarefa);
        System.out.println("Data atual: " + dataTarefa);
        System.out.println("Hora atual: " + horaTarefa);
    }
}
