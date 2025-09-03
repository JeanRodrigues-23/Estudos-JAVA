package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados converteDados = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=fa1639af";

    public void exibirMenu() {
        System.out.println("Digite o nome da série para busca:");
        String nomeSerie = leitura.nextLine();

        String jsonSerie = consumoAPI.obterDados((ENDERECO + nomeSerie.replace(" ", "+")+API_KEY));
        DadosSerie serie = converteDados.obterDados(jsonSerie, DadosSerie.class);
        System.out.println(serie);

        List<DadosTemporada> listaTemporadas = new ArrayList<>();
		for (int i = 1; i <= serie.totalTemporadas(); i++) {
			String jsonTemporada = consumoAPI.obterDados("https://www.omdbapi.com/?t=" + nomeSerie.replace(" ", "+") + "&season=" + i + "&apikey=fa1639af");
			DadosTemporada temporada = converteDados.obterDados(jsonTemporada, DadosTemporada.class);
			listaTemporadas.add(temporada);
		}
		listaTemporadas.forEach(System.out::println);

//        for (int i = 0; i < listaTemporadas.size(); i++) {
//            for (int j = 0; j < listaTemporadas.get(i).episodios().size(); j++) {
//                System.out.println(listaTemporadas.get(i).episodios().get(j).titulo());
//            }
//        }

        listaTemporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

//        List<String> nomes = Arrays.asList("Paulo", "Roberto", "Cristiano", "Carlos", "Ana");
//
//        nomes.stream()
//                .sorted()
//                .limit(3)
//                .filter(n -> n.startsWith("C"))
//                .map(n -> n.toUpperCase())
//                .forEach(System.out::println);

        List<DadosEpisodio> dadosEpisodio = listaTemporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        dadosEpisodio.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("n/a"))
                .limit(5)
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .forEach(System.out::println);
    }
}

