public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de " + numero);
        for (int i = 1; i < 11 ; i++) {
            System.out.println(String.format(i + " * " + numero + " = " + i * numero));
        }
    }
}
