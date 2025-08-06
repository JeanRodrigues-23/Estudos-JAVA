public class Livro extends Produto implements Calculavel{
    @Override
    public void calcularPrecoFinal() {
        setPreco(getPreco() * 1.05);
        System.out.println("O valor do livro agora é: " + getPreco());
    }

}
