public class Pessoa {
    public String nome;
    public int idade;
    public String CPF;

    public void falar(String fala) {
        System.out.println("Fala da pessoa: " + fala);
    }

    public void felizAniversario() {
        idade += 1;
    }
}
