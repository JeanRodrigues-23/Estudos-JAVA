import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public void exibirProdutoPerecivel() {
        System.out.println(String.format("""
                Informações do produto perecível:
                Nome: %s
                Preco: %.2f
                Quantidade: %d
                Data de validade: %S
                """, getNome(), getPreco(), getQuantidade(), getDataValidade()));
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
