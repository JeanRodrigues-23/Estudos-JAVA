import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;

    public void aplicarDesconto() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Deseja aplicar desconto?\n1 = sim\n2 = não");
        int opcao = leitura.nextInt();
        while (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida. Digite 1 para sim ou 2 para não.");
            opcao = leitura.nextInt();
        }

        if (opcao == 1) {
            System.out.println("Vamos aplicar desconto ao produto!");
            System.out.println("Informe a porcentagem de desconto:");
            int desconto = leitura.nextInt();
            this.preco -= this.preco * (desconto / 100.0);
            System.out.println(String.format("Desconto aplicado! Valor atual do produto: R$ %.2f", this.preco));
        } else {
            System.out.println("Não será aplicado desconto ao produto.");
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
