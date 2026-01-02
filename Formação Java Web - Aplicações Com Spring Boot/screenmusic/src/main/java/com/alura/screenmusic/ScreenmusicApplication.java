package com.alura.screenmusic;

import com.alura.screenmusic.principal.Principal;
import com.alura.screenmusic.repository.ArtistaReposotiry;
import com.alura.screenmusic.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmusicApplication implements CommandLineRunner {
	@Autowired
	ArtistaReposotiry artistaReposotiry;
	@Autowired
	MusicaRepository musicaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmusicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(artistaReposotiry, musicaRepository);
		principal.executarMenu();

	}
}
