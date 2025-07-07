public class Cachorro extends Animal {
    private String nome;

    @Override
    public void emitirSom() {
        System.out.println("AAU AUU AU AU!");
    }

    public void abanarORabo() {
        System.out.println("O cachorro abana o rabo alegremente!");
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
