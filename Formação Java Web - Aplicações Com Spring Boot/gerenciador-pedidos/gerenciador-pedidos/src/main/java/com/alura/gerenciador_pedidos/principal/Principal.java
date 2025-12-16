package com.alura.gerenciador_pedidos.principal;

import com.alura.gerenciador_pedidos.model.Categoria;
import com.alura.gerenciador_pedidos.model.Fornecedor;
import com.alura.gerenciador_pedidos.model.Pedido;
import com.alura.gerenciador_pedidos.model.Produto;
import com.alura.gerenciador_pedidos.repository.CategoriaRepository;
import com.alura.gerenciador_pedidos.repository.FornecedorRepository;
import com.alura.gerenciador_pedidos.repository.PedidoRepository;
import com.alura.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class Principal {
    private CategoriaRepository categoriaRepository;
    private PedidoRepository pedidoRepository;
    private ProdutoRepository produtoRepository;
    private FornecedorRepository fornecedorRepository;

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
    }
}
