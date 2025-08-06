import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private List<Integer> avaliacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {
        if (nota < 0 || nota > 5) {
            System.out.println("Nota inválida!");
        } else {
            avaliacoes.add(nota);
        }

    }

    public double mediaAvaliacoes() {
        int somaAvaliacoes = 0;
        for (Integer nota : avaliacoes) {
            somaAvaliacoes += nota;
        }
        return somaAvaliacoes / (double) avaliacoes.size();
    }

    public String getTitulo() {
        return this.titulo;
    }
}
