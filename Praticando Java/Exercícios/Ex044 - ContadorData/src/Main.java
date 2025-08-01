import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataDeInicio = LocalDate.of(2025, 7, 20);
        LocalDate dataPrazo = dataDeInicio.plusDays(20);

        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataPrazoFormatada = dataPrazo.format(padraoData);

        System.out.println("Data de entrega: " + dataPrazoFormatada);
    }
}
