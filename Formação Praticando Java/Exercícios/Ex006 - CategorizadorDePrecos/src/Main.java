import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Me informe um preço e eu informarei sua categoria com base na minha tabela:");
        double preco = leitura.nextDouble();

        if (preco < 50) {
            System.out.println("Categoria do produto: econômico");
        } else if (preco > 50 && preco <= 200) {
            System.out.println("Categoria do produto: intermediário");
        } else if (preco > 200) {
            System.out.println("Categoria do produto: premium");
        }
    }
}
