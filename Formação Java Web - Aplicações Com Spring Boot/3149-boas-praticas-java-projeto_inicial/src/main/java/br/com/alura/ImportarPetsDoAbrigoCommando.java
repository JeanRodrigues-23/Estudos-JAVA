package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsDoAbrigoCommando implements Command {

    @Override
    public void execute() {
        ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
        PetService petService = new PetService(clientHttpConfiguration);

        try {
            petService.importarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
