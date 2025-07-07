public class Gato extends Animal {
    private String nome;

    @Override
    public void emitirSom() {
        System.out.println("MIAU MIAU!");
    }

    public void ronronar() {
        System.out.println("O gato está ronronando!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
