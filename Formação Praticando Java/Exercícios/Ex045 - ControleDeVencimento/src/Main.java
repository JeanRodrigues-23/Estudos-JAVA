import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataDeVencimento = LocalDate.now();
        int mesesAdiados = 3;
        LocalDate dataDeVencimentoAdiada = dataDeVencimento.plusMonths(mesesAdiados);

        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String vecimentoAdiadoFormatado = dataDeVencimentoAdiada.format(padrao);

        System.out.println("Nova data de vencimento: " + vecimentoAdiadoFormatado);
    }
}
