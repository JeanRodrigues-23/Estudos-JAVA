public class Aluno {
    protected String nome;
    protected String tipo;

    public Aluno(String aluno, String tipo) {
        this.nome = tipo;
        this.tipo = tipo;
    }

    public void identificar() {
        System.out.println("Aluno: " + this.nome + " - Tipo: " + this.tipo);
    }
}
