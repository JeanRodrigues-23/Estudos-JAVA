package br.com.petshop.modelo;

public abstract class Animal implements AnimalDomestico{
    private String nome;
    private int idade;
    private String tipo;

    public Animal(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println("Lista informativa do pet:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Tipo: " + this.tipo);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Tipo: " + this.tipo;
    }
}
