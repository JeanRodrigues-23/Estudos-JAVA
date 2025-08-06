import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Double> listaNotas;
    private int notasRegistradas;
    private int notasIgnoradas;

    public Disciplina(String nome) {
        this.nome = nome;
        listaNotas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            listaNotas.add(nota);
            notasRegistradas++;
        } else {
            System.out.println("Nota inválida ignorada: " + nota);
            notasIgnoradas++;
        }
    }

    public double calculaMedia() {
        if (!listaNotas.isEmpty()){
            double soma = 0;
            for (double nota : listaNotas) {
                soma += nota;
            }

            return soma / listaNotas.size();
        } else {
            return 0.0;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getNotasIgnoradas() {
        return notasIgnoradas;
    }

    public int getNotasRegistradas() {
        return notasRegistradas;
    }
}
