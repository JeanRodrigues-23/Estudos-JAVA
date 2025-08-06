import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter padraoHora = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime horaAtual = LocalTime.now();
        ZonedDateTime horaSydney = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        String horaAtualFormatada = horaAtual.format(padraoHora);
        String horaSydneyFormatada = horaSydney.format(padraoHora);

        System.out.println("Horário atual no sistema: " + horaAtualFormatada);
        System.out.println("Horário atual em Sydney: " + horaSydneyFormatada);


    }
}
