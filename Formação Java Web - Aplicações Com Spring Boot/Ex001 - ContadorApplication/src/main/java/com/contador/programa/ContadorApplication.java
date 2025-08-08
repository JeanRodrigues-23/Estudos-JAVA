package com.contador.programa;

import com.contador.programa.model.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tarefa tarefa1 = new Tarefa("Ir ao mercado", false, "Jean");

		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(new File("tarefa.json"), tarefa1);

		System.out.println("Arquivo JSON criado!");


		try {
			Tarefa tarefa1desserializada = mapper.readValue(new File("tarefa.json"), Tarefa.class);
			System.out.println(tarefa1desserializada);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
