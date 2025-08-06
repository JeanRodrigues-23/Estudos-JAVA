public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido!");
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }

        System.out.println("Produto: " + this.nome);
        System.out.println("Produto: " + this.preco);

    }
}
