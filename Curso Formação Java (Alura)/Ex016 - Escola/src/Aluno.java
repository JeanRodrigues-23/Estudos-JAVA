public class Aluno {
    private String nome;
    private double notas;
    private int contadorNotas;

    public String getNome() {
        return this.nome;
    }

    public double getNotas() {
        return this.notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(int nota) {
        this.notas = nota;
    }

    public int getContadorNotas() {
        return this.contadorNotas;
    }

    public void adicionarNota(double nota) {
        this.notas += nota;
        this.contadorNotas++;
    }

    public double calcularMedia() {
        double media = this.notas / this.contadorNotas;
        return media;
    }

}
