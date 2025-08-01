import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalTime horaDeInicio = LocalTime.of(21, 0, 0);
        LocalTime horaDeTermino = LocalTime.of(22, 30, 0);

        Duration tempoGasto = Duration.between(horaDeInicio, horaDeTermino);

        System.out.println("Diferença de tempo de " + tempoGasto.toHours() + " horas e " + tempoGasto.toMinutesPart() + " minutos.");
    }
}
