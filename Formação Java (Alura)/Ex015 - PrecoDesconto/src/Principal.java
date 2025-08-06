import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Produto tenis = new Produto();

        tenis.setNome("Sapatenis");
        tenis.setPreco(150.0);

        System.out.println(String.format("O produto %s custa R$ %.2f\n", tenis.getNome(), tenis.getPreco()));
        tenis.aplicarDesconto();

    }

}
