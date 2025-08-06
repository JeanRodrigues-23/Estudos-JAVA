public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Matemática");

        disciplina1.adicionarNota(6.7);
        disciplina1.adicionarNota(9.7);
        disciplina1.adicionarNota(5.8);
        disciplina1.adicionarNota(16.7);
        disciplina1.adicionarNota(-4.7);
        disciplina1.adicionarNota(20.6);

        System.out.println("Total de notas válidas: " + disciplina1.getNotasRegistradas());
        System.out.printf("Média em %s: %.2f", disciplina1.getNome(), disciplina1.calculaMedia());
    }
}
