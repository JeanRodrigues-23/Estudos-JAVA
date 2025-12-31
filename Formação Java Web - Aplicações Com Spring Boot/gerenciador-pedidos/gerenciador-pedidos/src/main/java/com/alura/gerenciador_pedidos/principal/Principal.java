package com.alura.gerenciador_pedidos.principal;

import com.alura.gerenciador_pedidos.model.Categoria;
import com.alura.gerenciador_pedidos.model.Fornecedor;
import com.alura.gerenciador_pedidos.model.Pedido;
import com.alura.gerenciador_pedidos.model.Produto;
import com.alura.gerenciador_pedidos.repository.CategoriaRepository;
import com.alura.gerenciador_pedidos.repository.FornecedorRepository;
import com.alura.gerenciador_pedidos.repository.PedidoRepository;
import com.alura.gerenciador_pedidos.repository.ProdutoRepository;
import jakarta.persistence.Tuple;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.util.*;

public class Principal {
    private CategoriaRepository categoriaRepository;
    private PedidoRepository pedidoRepository;
    private ProdutoRepository produtoRepository;
    private FornecedorRepository fornecedorRepository;
    private final Scanner leitura = new Scanner(System.in);

    public Principal(CategoriaRepository categoriaRepository, PedidoRepository pedidoRepository, ProdutoRepository produtoRepository, FornecedorRepository fornecedorRepository) {
        this.categoriaRepository = categoriaRepository;
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
        this.fornecedorRepository = fornecedorRepository;
    }

    public void executaAplicacao() {
//        // Criando categorias
//        Categoria categoriaEletronicos = new Categoria("Eletrônicos");
//        Categoria categoriaLivros = new Categoria("Livros");
//        categoriaRepository.saveAll(List.of(categoriaEletronicos, categoriaLivros));
//
//        // Criando fornecedores
//        Fornecedor fornecedorTech = new Fornecedor("Tech Supplier");
//        Fornecedor fornecedorLivros = new Fornecedor("Livraria Global");
//        fornecedorRepository.saveAll(List.of(fornecedorTech, fornecedorLivros));
//
//        // Criando produtos
//        Produto produto1 = new Produto("Notebook", 3500.0, categoriaEletronicos);
//        Produto produto2 = new Produto("Smartphone", 2500.0, categoriaEletronicos);
//        Produto produto3 = new Produto("Livro de Java", 100.0, categoriaLivros);
//        produto1.setFornecedor(fornecedorTech);
//        produto2.setFornecedor(fornecedorTech);
//        produto3.setFornecedor(fornecedorLivros);
//        produtoRepository.saveAll(List.of(produto1, produto2, produto3));
//
//        // Criando pedidos e associando produtos
//        Pedido pedido1 = new Pedido(LocalDate.now());
//        pedido1.setProdutos(List.of(produto1, produto3));
//        Pedido pedido2 = new Pedido(LocalDate.now().minusDays(1));
//        pedido2.setProdutos(List.of(produto2));
//        pedidoRepository.saveAll(List.of(pedido1, pedido2));
//
//        // Testando consultas e verificando os relacionamentos
//        System.out.println("Produtos na categoria Eletrônicos:");
//        categoriaRepository.findById(11L).ifPresent(categoria ->
//                categoria.getProdutos().forEach(produto ->
//                        System.out.println(" - " + produto.getNome())
//                )
//        );

        System.out.println("\nPedidos e seus produtos:");
        pedidoRepository.findAll().forEach(pedido -> {
            System.out.println("Pedido " + pedido.getId() + ":");
            pedido.getProdutos().forEach(produto ->
                    System.out.println(" - " + produto.getNome())
            );
        });

        System.out.println("\nProdutos e seus fornecedores:");
        produtoRepository.findAll().forEach(produto ->
                System.out.println("Produto: " + produto.getNome() +
                        ", Fornecedor: " + produto.getFornecedor().getNome())
        );

//        System.out.println("\nPESQUISAR PRODUTO\nDigite o nome de um produto:");
//        String nome = leitura.nextLine();
//        List<Produto> listaProdutos = produtoRepository.findByNome(nome);
//
//        if (listaProdutos.isEmpty()) {
//            System.out.println("Ops! Não há produtos com este nome.");
//        } else {
//            System.out.println("Produtos encontrados:");
//            listaProdutos.forEach(System.out::println);
//        }

//        System.out.println("\PESQUISAR PRODUTO POR CATEGORIA\nDigite a categoria do produto");
//        String nome = leitura.nextLine();
//        List<Produto> listaProdutos = produtoRepository.findByCategoria_Nome(nome);
//
//        if (listaProdutos.isEmpty()) {
//            System.out.println("Ops! Não encontramos produto com essa categoria.");
//        } else {
//            System.out.println("Produtos encontrados:");
//            listaProdutos.forEach(System.out::println);
//        }

//        System.out.println("\nPESQUISAR PRODUTOS POR VALOR\nDigite o valor mínimo do produto:");
//        double valorDigitado = leitura.nextDouble();
//        leitura.nextLine();
//
//        List<Produto> produtos = produtoRepository.findByPrecoGreaterThan(valorDigitado);
//        if (produtos.isEmpty()) {
//            System.out.println("Ops! Não encontramos produtos com valor menor que o fornecido.");
//        } else {
//            System.out.println("Produtos encontrados:");
//            produtos.forEach(System.out::println);
//        }

//        System.out.println("\nPESQUISAR PRODUTOS POR VALOR\nDigite o valor máximo dos produtos:");
//        double valorDigitado = leitura.nextDouble();
//        leitura.nextLine();
//
//        List<Produto> produtos = produtoRepository.findByPrecoLessThan(valorDigitado);
//        if (produtos.isEmpty()) {
//            System.out.println("Ops! Não encontramos produtos com valor máximo fornecido.");
//        } else {
//            System.out.println("Produtos encontrados:");
//            produtos.forEach(System.out::println);
//        }

//        System.out.println("\nPESQUISAR PRODUTOS POR VALOR\nDigite o trecho do nome do produto:");
//        String trecho = leitura.nextLine();
//
//        List<Produto> produtos = produtoRepository.findByNomeContainingIgnoreCase(trecho);
//        if (produtos.isEmpty()) {
//            System.out.println("Ops! Não encontramos produtos com trecho fornecido.");
//        } else {
//            System.out.println("Produtos encontrados:");
//            produtos.forEach(System.out::println);
//        }

//        List<Produto> produtoList = pedidoRepository.findByDataIsNull();
//
//        System.out.println("Analisando produtos sem data de entrega...");
//        if (produtoList.isEmpty()) {
//            System.out.println("Não encontrado produtos sem data de entrega.");
//        } else {
//            System.out.println("Produtos encontrados:");
//            produtoList.forEach(System.out::println);
//        }

//        List<Pedido> produtoList = pedidoRepository.findByDataIsNotNull();
//
//        System.out.println("Analisando produtos com data de entrega...");
//        if (produtoList.isEmpty()) {
//            System.out.println("Não encontrado produtos com data de entrega.");
//        } else {
//            System.out.println("Produtos encontrados:");
//            produtoList.forEach(System.out::println);
//        }

//        System.out.println("PESQUISANDO PRODUTOS POR CATEGORIA ORDENADOS POR PREÇO:");
//        System.out.println("Digite a categoria do produto");
//        String categoriaDigitada = leitura.nextLine();
//
//        List<Produto> produtoList = produtoRepository.findByCategoria_NomeOrderByPrecoDesc(categoriaDigitada);
//        if (produtoList.isEmpty()) {
//            System.out.println("Nenhum produto encontrado nesta categoria.");
//        } else {
//            System.out.println("Produtos encontrados");
//            produtoList.forEach(System.out::println);
//        }

//        System.out.println("PESQUISANDO PRODUTOS POR CATEGORIA ORDENADOS POR PREÇO:");
//        System.out.println("Digite a categoria do  em order crescente de preço:");
//        String categoriaDigitada = leitura.nextLine();
//
//        List<Produto> produtoList = produtoRepository.findByCategoria_NomeOrderByPreco(categoriaDigitada);
//        if (produtoList.isEmpty()) {
//            System.out.println("Nenhum produto encontrado nesta categoria.");
//        } else {
//            System.out.println("Produtos encontrados em ordem descrescente de preço");
//            produtoList.forEach(System.out::println);
//        }

//        System.out.println("PESQUISANDO PRODUTOS EM UMA CATEGORIAE ESPECÍFICA");
//        System.out.println("Digite a categoria do produto:");
//        String categoriaDigitada = leitura.nextLine();
//
//        long contagem = produtoRepository.countByCategoriaNome(categoriaDigitada);
//        if (contagem == 0) {
//            System.out.println("Nenhum produto encontrado nesta categoria.");
//        } else {
//            System.out.println("Encontrado " + contagem + " produto(s).");
//        }

//        System.out.println("PESQUISANDO PRODUTOS COM VALOR MÁXIMO ESPECIFICADO OU QUE CONTENHAM O NOME DEFINIDO");
//        System.out.println("Digite o valor máximo:");
//        double valorDigitado = leitura.nextDouble();
//        leitura.nextLine();
//        System.out.println("Digite o trecho do nome");
//        String trechoDigitado = leitura.nextLine();
//
//        List<Produto> produtoList = produtoRepository.findByPrecoLessThanOrNomeContainingIgnoreCase(valorDigitado, trechoDigitado);
//
//        if (produtoList.isEmpty()) {
//            System.out.println("Ops! Nenhum produto encontrado!");
//        } else {
//            System.out.println("Produtos encontrados:");
//            produtoList.forEach(System.out::println);
//        }

//        System.out.println("CONTAGEM DE PRODUTOS COM VALOR MAIOR QUE O FORNECIDO");
//        System.out.println("Digite o valor mínimo:");
//        double valorDigitado = leitura.nextDouble();
//        leitura.nextLine();
//
//        long produtoList = produtoRepository.countByPrecoGreaterThan(valorDigitado);
//
//        if (produtoList == 0) {
//            System.out.println("Ops! Nenhum produto encontrado!");
//        } else {
//            System.out.println("Encontrado(s) " + produtoList + " produto(s)");
//        }

//        System.out.println("\nLOCALIZAR PEDIDOS POSTERIORES A UMA DATA\nDigite uma data de pedido(yyyy-MM-dd)");
//        String dataString = leitura.nextLine();
//        LocalDate dataConvertida = LocalDate.parse(dataString);
//
//        List<Pedido> pedidoList = pedidoRepository.findByDataAfter(dataConvertida);
//
//        if (pedidoList.isEmpty()) {
//            System.out.println("Ops! Não foi localizado pedido posterior a essa data.");
//        } else {
//            System.out.println("Pedidos encontrados:");
//            pedidoList.forEach(System.out::println);
//        }

//        System.out.println("\nLOCALIZAR PEDIDOS ANTERIORES A UMA DATA\nDigite uma data de pedido(yyyy-MM-dd)");
//        String dataString = leitura.nextLine();
//        LocalDate dataConvertida = LocalDate.parse(dataString);
//
//        List<Pedido> pedidoList = pedidoRepository.findByDataBefore(dataConvertida);
//
//        if (pedidoList.isEmpty()) {
//            System.out.println("Ops! Não foi localizado pedido anterior a essa data.");
//        } else {
//            System.out.println("Pedidos encontrados:");
//            pedidoList.forEach(System.out::println);
//        }

//        System.out.println("\nLOCALIZAR PEDIDOS FEITOS ENTRE DETERMINADAS DATAS\nDigite a data inicial:(yyyy-MM-dd)");
//        String dataInicialString = leitura.nextLine();
//        LocalDate dataInicial = LocalDate.parse(dataInicialString);
//
//        System.out.println("Digite a data final:(yyyy-MM-dd)");
//        String dataFinalString = leitura.nextLine();
//        LocalDate dataFinal = LocalDate.parse(dataFinalString);
//
//        List<Pedido> pedidoList = pedidoRepository.findByDataBetween(dataInicial, dataFinal);
//
//        if (pedidoList.isEmpty()) {
//            System.out.println("Ops! Não foi localizado pedido anterior a essa data.");
//        } else {
//            System.out.println("Pedidos encontrados:");
//            pedidoList.forEach(System.out::println);
//        }

//        System.out.println("\nLOCALIZAR OS TRÊS PEDIDOS MAIS CAROS");
//        List<Produto> produtoList = produtoRepository.findTop3ByOrderByPrecoDesc();
//
//        if (produtoList.isEmpty()) {
//            System.out.println("Ops! Produtos não localizados.");
//        } else {
//            System.out.println("produtos encontrados:");
//            produtoList.forEach(System.out::println);
//        }

//        System.out.println("\nLOCALIZAR OS CINCO PEDIDOS MAIS BARATOS DE UMA CATEGORIA\nDigite a categoria desejada:");
//        String categoriaDigitada = leitura.nextLine();
//
//        List<Produto> produtoList = produtoRepository.findByCategoria_NomeOrderByPreco(categoriaDigitada);
//
//        if (produtoList.isEmpty()) {
//            System.out.println("Ops! Nenhum produto localizado.");
//        } else {
//            System.out.println("Produtos encontrados:");
//            produtoList.forEach(p -> System.out.println((produtoList.indexOf(p) + 1) + " - " + p));
//        }


//        System.out.println("PRODUTOS COM VALOR MÍNIMO\nDigite um valor mínimo para a busca dos produtos:");
//        Double valorMinimo = leitura.nextDouble();
//        leitura.nextLine();
//
//        List<Produto> produtoList = produtoRepository.produtosValorMinimo(valorMinimo);
//
//        if (produtoList.isEmpty()) {
//            System.out.println("Ops! Não encontrei nenhum produto com valor abaixo do informado.");
//        } else {
//            System.out.println("Prdutos encontrados:");
//            produtoList.forEach(System.out::println);
//        }

//        System.out.println("PRODUTOS ORDENADOS POR PRECO DECRESCENTE:");
//        List<Produto> produtoList = produtoRepository.produtosOrdenadosPorPreco();
//
//        if (produtoList.isEmpty()) {
//            System.out.println("Ops! Não encontrei nenhum produto para ordenar.");
//        } else {
//            System.out.println("Prdutos ordenados:");
//            produtoList.forEach(p -> System.out.println(produtoList.indexOf(p) + 1 + " - " + p));
//        }

//        System.out.println("PRODUTOS ORDENADOS POR PRECO CRESCENTE:");
//        List<Produto> produtoList = produtoRepository.produtosOdernadosPorPrecoDecrescente();
//
//        if (produtoList.isEmpty()) {
//            System.out.println("Ops! Não encontrei nenhum produto para ordenar.");
//        } else {
//            System.out.println("Prdutos ordenados:");
//            produtoList.forEach(p -> System.out.println(produtoList.indexOf(p) + 1 + " - " + p));
//        }

//        System.out.println("PRODUTOS QUE COMEÇAM COM A LETRA ESCOLHIDA\nDigite a letra desejada:");
//        String letraEscolhida = leitura.nextLine();
//
//        List<Produto> produtoList = produtoRepository.listarProdutosComLetra(letraEscolhida);
//
//        if (produtoList.isEmpty()) {
//            System.out.println("Ops! Não encontrei nenhum produto que comece com essa letra.");
//        } else {
//            System.out.println("Prdutos encontrados:");
//            produtoList.forEach(p -> System.out.println(produtoList.indexOf(p) + 1 + " - " + p));
//        }

//        System.out.println("RETORNAR PEDIDOS FEITOS ENTRE DUAS DATAS:");
//
//        System.out.println("Informe a primeira data (yyyy-MM-dd)");
//        String data1 = leitura.nextLine();
//        System.out.println("Informe a segunda data (yyyy-MM-dd)");
//        String data2 = leitura.nextLine();
//
//        LocalDate data1Formatada = LocalDate.parse(data1);
//        LocalDate data2Formatada = LocalDate.parse(data2);
//
//        List<Pedido> produtoList = pedidoRepository.listarPedidosEntreData(data1Formatada, data2Formatada);
//
//        if (produtoList.isEmpty()) {
//            System.out.println("Ops! Não encontrei nenhum pedido com a data entre estas.");
//        } else {
//            System.out.println("Prdutos encontrados:");
//            produtoList.forEach(p -> System.out.println(produtoList.indexOf(p) + 1 + " - " + p));
//        }

//        System.out.println("RETORNAR MEDIA DO PRECO DE TODOS OS PRODUTOS");
//
//        System.out.printf("A média de preço dos produtos é: %.2f\n", produtoRepository.retornaMediaPrecoProdutos());

//        System.out.println("RETORNAR O PREÇO MÁXIMO DE UM PRODUTO EM UMA CATEGORIA\nDigite a categoria:");
//        String categoriaEscolhida = leitura.nextLine();
//
//        Optional<Produto> produto = produtoRepository.retornaMaisCaroDaCategoria(categoriaEscolhida);
//
//        produto.ifPresentOrElse(p -> {
//            System.out.println("Produto encontrado: " + p);
//        },
//        () -> System.out.println("Nenhum produto encontrado."));

//        System.out.println("CONTAGEM DO NÚMERO DE PRODUTOS POR CATEGORIA");
//        List<Tuple> mapaContagemPorCategoria = produtoRepository.ContagemDeProdutosPorCategoria();
//
//        if (mapaContagemPorCategoria.isEmpty()) {
//            System.out.println("Não encontrado produtos.");
//        } else {
//            System.out.println(mapaContagemPorCategoria);
//        }

        System.out.println("FILTRAR CATEGORIAS COM NÚMERO MÍNIMO DE PRODUTOS\nDigite a quantidade mínima:");
        long quantidade = leitura.nextLong();
        leitura.nextLine();

        List<Tuple> categorias = produtoRepository.retornaCategoriasComMinomoDeProdutos(quantidade);

        if (categorias.isEmpty()) {
            System.out.println("Não encontrei nenhuma categoria.");
        } else {
            System.out.println("Categorias encontradas:");
            categorias.forEach(System.out::println);
        }
    }
}
