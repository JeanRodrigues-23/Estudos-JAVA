import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataEvento = LocalDate.of(2025, 9, 15);

        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataAtualFormatado = dataAtual.format(padraoData);
        String dataEventoFormatada = dataEvento.format(padraoData);
        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatado);

        if(dataAtual.isBefore(dataEvento)) {
            System.out.println("O evento ainda não ocorreu!");
        } else {
            System.out.println("O evento já ocorreu!");
        }
    }
}
