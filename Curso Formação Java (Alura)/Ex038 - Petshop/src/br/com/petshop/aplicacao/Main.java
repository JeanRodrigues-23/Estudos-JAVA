package br.com.petshop.aplicacao;

import br.com.petshop.modelo.Cachorro;
import br.com.petshop.modelo.Gato;
import br.com.petshop.servico.PetShopService;

public class Main {
    public static void main(String[] args) {

        PetShopService petshop = new PetShopService();

        Cachorro cachorro1 = new Cachorro("Bolinha", 6, "Cachorro", "Labrador", "Amarelo");
        Cachorro cachorro2 = new Cachorro("Café", 1, "Cachorro", "Poodle", "Preto");
        Cachorro cachorro3 = new Cachorro("Max", 4, "Cachorro", "Bulldog", "Branco e marrom");
        Cachorro cachorro4 = new Cachorro("Bella", 1, "cachorro", "Golden", "Dourado");
        Cachorro cachorro5 = new Cachorro("Fred", 5, "Cachorro", "Dachshund", "Preto e marrom");

        Gato gato1 = new Gato("Luna", 2, "Gato", "Siamês", "Creme e cinza");
        Gato gato2 = new Gato("Oliver", 4, "Gato", "Persa", "Branco");
        Gato gato3 = new Gato("Simba", 1, "gato", "Bengal", "Marrom");
        Gato gato4 = new Gato("Nina", 3, "Gato", "Maine Coon", "Cinza");
        Gato gato5 = new Gato("Tom", 5, "Gato", "Sphynx", "Rosa claro");

        petshop.adicionarAnimal(cachorro1);
        petshop.adicionarAnimal(cachorro2);
        petshop.adicionarAnimal(cachorro3);
        petshop.adicionarAnimal(cachorro4);
        petshop.adicionarAnimal(cachorro5);
        petshop.adicionarAnimal(gato1);
        petshop.adicionarAnimal(gato2);
        petshop.adicionarAnimal(gato3);
        petshop.adicionarAnimal(gato4);
        petshop.adicionarAnimal(gato5);

        petshop.listarAnimais();
        petshop.emitirSons();
    }
}
