package com.alura.gerenciador_pedidos.principal;

import com.alura.gerenciador_pedidos.model.Produto;
import com.alura.gerenciador_pedidos.repository.CategoriaRepository;
import com.alura.gerenciador_pedidos.repository.FornecedorRepository;
import com.alura.gerenciador_pedidos.repository.PedidoRepository;
import com.alura.gerenciador_pedidos.repository.ProdutoRepository;

import java.util.List;
import java.util.Scanner;

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

        // Testando consultas e verificando os relacionamentos
        System.out.println("Produtos na categoria Eletrônicos:");
        categoriaRepository.findById(11L).ifPresent(categoria ->
                categoria.getProdutos().forEach(produto ->
                        System.out.println(" - " + produto.getNome())
                )
        );

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

    }
}
