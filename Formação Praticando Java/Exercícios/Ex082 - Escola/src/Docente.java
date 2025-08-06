public class Docente extends Pessoa{
    private String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.printf("""
                - DADOS DOCENTE -
                Nome - %s
                Idade - %d
                Disciplina - %s
                """, getNome(), getIdade(), this.disciplina);
    }
}
