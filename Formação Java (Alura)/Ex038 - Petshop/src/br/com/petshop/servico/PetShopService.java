package br.com.petshop.servico;

import br.com.petshop.modelo.AnimalDomestico;
import br.com.petshop.modelo.Cachorro;
import br.com.petshop.modelo.Gato;

import java.util.ArrayList;
import java.util.List;

public class PetShopService {
    public List<AnimalDomestico> animais;

    public PetShopService() {
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(AnimalDomestico animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        System.out.println("--- Lista de Animais");
        for (AnimalDomestico animal : animais) {
            System.out.println(animal);
        }
    }

    public void emitirSons() {
        System.out.println("--- Sons dos Animais ---");
        for (AnimalDomestico animal : animais) {
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                System.out.print(cachorro.getNome() + " diz: ");
                cachorro.emitirSom();
            }
            if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                System.out.print(gato.getNome() + " diz: ");
                gato.emitirSom();
            }
        }
    }
}

