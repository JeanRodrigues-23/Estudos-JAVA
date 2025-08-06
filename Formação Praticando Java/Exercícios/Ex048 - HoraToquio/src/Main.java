import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime horaToquio = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaToquioFormatada = horaToquio.format(padraoData);

        System.out.println("Horário atual em Toquio: " + horaToquioFormatada);
    }
}
