public class Operacoes {
    public static int somar(int n1, int n2) throws TesteException {
        if (n1 > 0 && n2 > 0) {
            return n1 + n2;
        } else {
            throw new TesteException("O método soma somente valores positivos");
        }

    }
}
