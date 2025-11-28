package br.com.alura.tabelafipe.principal;

import br.com.alura.tabelafipe.model.*;
import br.com.alura.tabelafipe.service.ConsumoAPI;
import br.com.alura.tabelafipe.service.ConverteDados;
import tools.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConverteDados converteDados = new ConverteDados();
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String endereco = "https://parallelum.com.br/fipe/api/v1/";

    public void exibirMenu() {

        // Menu
        System.out.println("""
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                Programa de pesquisa da tabela fipe. Escreva abaixo uma opção:
                """);
        String marcaEscolhida = leitura.nextLine();

        String marcaTratada = "";
        if(marcaEscolhida.equalsIgnoreCase("Carro")) {
            marcaTratada = "carros";
        } else if (marcaEscolhida.equalsIgnoreCase("Moto")) {
            marcaTratada = "motos";
        } else if (marcaEscolhida.equalsIgnoreCase("Caminhão")) {
            marcaTratada = "caminhoes";
        } else {
            System.out.println("Valor inváldio. Escreva exatamente como uma das opções acima.");
            return;
        }

        //Consulta da API, desserialização e apresentação das marcas
        String jsonMarcas = consumoAPI.obterDados(endereco + marcaTratada + "/marcas");
        List<Marca> marcas = converteDados.converteDadosLista(jsonMarcas, Marca.class);

        marcas.stream()
                .forEach(System.out::println);

        //Consulta da API, desserialização e apresentação dos modelos
        System.out.println("Informe o código da marca para consulta: ");
        String codigoEscolhido = leitura.nextLine();

        String jsonModelos = consumoAPI.obterDados(endereco + marcaTratada + "/marcas/" + codigoEscolhido.trim() + "/modelos");
        ObjectMapper mapper = new ObjectMapper();
        ModelosAnos modelosAnos = converteDados.converteDadosObjeto(jsonModelos, ModelosAnos.class);

        modelosAnos.modelos().forEach(System.out::println);

        //Filtro por modelo do carro
        System.out.println("Digite um trecho do nome do veículo para consulta:");
        String modeloEscolhido = leitura.nextLine();

        List<Modelos> buscaModelo = modelosAnos.modelos().stream()
                .filter(m -> m.nome().contains(modeloEscolhido))
                .toList();

        buscaModelo.forEach(System.out::println);

        //-----------------

        System.out.println("Digite o código do modelo para consultar valores:");
        String codigoModeloEscolhido = leitura.nextLine();

        String jsonAnos = consumoAPI.obterDados(endereco + marcaTratada + "/marcas/" + codigoEscolhido.trim() + "/modelos/" + codigoModeloEscolhido.trim() + "/anos");
        List<Anos> anos = converteDados.converteDadosLista(jsonAnos, Anos.class);

        List<ValorFipe> valorFipeList = new ArrayList<>();
        for(int i = 0; i < anos.size(); i++) {
            String jsonValorFipe = consumoAPI.obterDados(endereco + marcaTratada + "/marcas/" + codigoEscolhido.trim() + "/modelos/" + codigoModeloEscolhido.trim() + "/anos/" + anos.get(i).codigo());
            ValorFipe valorFipe = converteDados.converteDadosObjeto(jsonValorFipe, ValorFipe.class);
            valorFipeList.add(valorFipe);
        }

        valorFipeList.forEach(System.out::println);

    }
}
