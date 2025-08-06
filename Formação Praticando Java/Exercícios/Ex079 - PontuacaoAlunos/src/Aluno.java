public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void ganharPontos(int pontos) {
        if (pontos > 0) {
            this.pontos += pontos;

            atualizarNivel();
        } else {
            System.out.println("Pontuação inválida.");
        }
    }

    public void exibirAluno() {
        System.out.printf("""               
                DETALHES DO ALUNO:
                Nome: %s
                Pontos: %d
                Nivel: %d
                """, this.nome, this.pontos, this.nivel);
    }

    public int atualizarNivel() {
        return this.nivel = 1 + ( this.pontos / 100);
    }
}
