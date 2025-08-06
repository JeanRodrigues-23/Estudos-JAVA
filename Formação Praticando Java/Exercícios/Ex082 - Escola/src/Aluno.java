public class Aluno extends Pessoa{
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.printf("""
                - DADOS ALUNO -
                Nome - %s
                Idade - %d
                Nota - %.2f
                """, getNome(), getIdade(), this.nota);
    }
}
