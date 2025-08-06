public class ArCondicionado implements Controlavel{
    private boolean ligado = false;

    @Override
    public void ligar() {
        if (ligado) {
            System.out.println("O ar-condicionado já está ligado.");
        } else {
            ligado = true;
            System.out.println("Ar-condicionado ligado!");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Ar-condicionado desligado!");
        } else {
            System.out.println("O ar-condicionado já está desligado!");
        }
    }
}
