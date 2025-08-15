package br.com.alura.screenmatch;

import br.com.alura.screenmatch.Principal.Principal;
import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		ConsumoAPI consumoAPI = new ConsumoAPI();
//		String jsonSerie = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=fa1639af");
//
//		ConverteDados conversor = new ConverteDados();
//		DadosSerie dados = conversor.obterDados(jsonSerie, DadosSerie.class);
//		System.out.println(dados);
//
//		String jsonEpisodioSerie = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=8&apikey=fa1639af");
//		DadosEpisodio episodio = conversor.obterDados(jsonEpisodioSerie, DadosEpisodio.class);
//		System.out.println(episodio);
//
//		List<DadosTemporada> listaTemporadas = new ArrayList<>();
//		for (int i = 1; i <= dados.totalTemporadas(); i++) {
//			String jsonTemporada = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=fa1639af");
//			DadosTemporada temporada = conversor.obterDados(jsonTemporada, DadosTemporada.class);
//			listaTemporadas.add(temporada);
//		}
//		listaTemporadas.forEach(System.out::println);

		Principal principal = new Principal();
		principal.exibirMenu();
	}
}
