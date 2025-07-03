public class IdadePessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade() {
        if (this.idade < 18) {
            System.out.println("A pessoa é MENOR de idade");
        } else {
            System.out.println("A pessoa é MAIOR de idade");
        }
    }
}
