public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Macedo", 17, 8.5);
        Docente docente1 = new Docente("Carlos Antônio", 34, "Portugês");

        aluno1.exibirDados();
        docente1.exibirDados();
    }
}
