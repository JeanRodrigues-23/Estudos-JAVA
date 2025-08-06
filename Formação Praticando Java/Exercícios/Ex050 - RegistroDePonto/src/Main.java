import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        DateTimeFormatter padraoHora = DateTimeFormatter.ofPattern("HH:mm");

        // Entrada do usuário
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(leitura.next(), padraoHora);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = leitura.nextInt();
        leitura.nextLine();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saida = LocalTime.parse(leitura.next(), padraoHora);

        leitura.close();

        // Cálculo de duração
        Duration cargaTrabalhada = Duration.between(entrada, saida);
        Duration saldoHoras = cargaTrabalhada.minus(Duration.ofHours(cargaHoraria));

        String sinal = "";
        if (saldoHoras.toMinutes() > 0) {
            sinal = "+";
        }

        // Saída de dados
        System.out.println("Saldo em horas: " + sinal + saldoHoras.toHours() + "h " + saldoHoras.toMinutesPart() + "min");

    }
}
