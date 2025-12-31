package com.alura.screenmusic;

import com.alura.screenmusic.principal.Principal;
import com.alura.screenmusic.repository.ArtistaReposotiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmusicApplication implements CommandLineRunner {
	@Autowired
	ArtistaReposotiry artistaReposotiry;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmusicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(artistaReposotiry);
		principal.executarMenu();

	}
}
