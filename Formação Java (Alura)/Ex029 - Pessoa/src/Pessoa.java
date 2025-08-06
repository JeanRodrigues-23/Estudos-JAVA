public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    };

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString () {
        return this.nome + " possui " + this.idade + " anos!";
    }
}
