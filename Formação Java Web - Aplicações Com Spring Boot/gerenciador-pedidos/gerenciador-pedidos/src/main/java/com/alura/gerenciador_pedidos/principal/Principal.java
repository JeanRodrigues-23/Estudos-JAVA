package com.alura.gerenciador_pedidos.principal;

import com.alura.gerenciador_pedidos.model.Categoria;
import com.alura.gerenciador_pedidos.model.Pedido;
import com.alura.gerenciador_pedidos.model.Produto;
import com.alura.gerenciador_pedidos.repository.CategoriaRepository;
import com.alura.gerenciador_pedidos.repository.PedidoRepository;
import com.alura.gerenciador_pedidos.repository.ProdutoRepository;

import java.time.LocalDate;

public class Principal {
    private CategoriaRepository categoriaRepository;
    private PedidoRepository pedidoRepository;
    private ProdutoRepository produtoRepository;

    public Principal(CategoriaRepository categoriaRepository, PedidoRepository pedidoRepository, ProdutoRepository produtoRepository) {
        this.categoriaRepository = categoriaRepository;
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
    }

    public void executaAplicacao() {
        Pedido pedido = new Pedido(LocalDate.now());
        Produto produto = new Produto("Sapato", 200.00);
        Categoria categoria = new Categoria("Calçados");

        pedidoRepository.save(pedido);
        categoriaRepository.save(categoria);
        produtoRepository.save(produto);
    }
}
