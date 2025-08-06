import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate diaVencimento = LocalDate.of(2025, 9, 20);
        int antecedenciaNotificacao = 5;
        LocalDate dataLembrete = diaVencimento.minusDays(5);

        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String DataLembreteFormatado = dataLembrete.format(padraoData);

        System.out.println("Data do lembrete: " + DataLembreteFormatado);
    }
}
