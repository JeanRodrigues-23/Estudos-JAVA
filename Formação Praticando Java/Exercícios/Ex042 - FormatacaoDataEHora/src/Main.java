import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataAtualFormatada = dataAtual.format(formatoData);
        String horaAtualFormatada = horaAtual.format(formatoHora);

        System.out.println("Data formatada: " + dataAtualFormatada);
        System.out.println("Hora formatada: " + horaAtualFormatada);
    }
}
