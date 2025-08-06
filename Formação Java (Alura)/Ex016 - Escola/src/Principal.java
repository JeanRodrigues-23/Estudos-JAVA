public class Principal {
    public static void main(String[] args) {
        Aluno jean = new Aluno();

        jean.setNome("Jean Rodrigues");

        jean.adicionarNota(8);
        jean.adicionarNota(9);
        jean.adicionarNota(7);

        System.out.println(String.format("O aluno %s tem %d notas. A média de suas notas é %.2f", jean.getNome(), jean.getContadorNotas(), jean.calcularMedia()));
    }
}
