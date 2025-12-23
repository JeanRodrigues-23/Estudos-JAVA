package com.alura.gerenciador_pedidos.repository;

import com.alura.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNome(String nome);

    List<Produto> findByCategoria_Nome(String categoria);

    List<Produto> findByPrecoGreaterThan(double valor);

    List<Produto> findByPrecoLessThan(double valor);

    List<Produto> findByNomeContainingIgnoreCase(String Nome);

    List<Produto> findByCategoria_NomeOrderByPrecoDesc(String categoria);
    
    List<Produto> findByCategoria_NomeOrderByPrecoAsc(String categoria);

    List<Produto> findByCategoria_NomeOrderByPreco(String categoriaDigitada);

    long countByCategoriaNome(String categoria);

    List<Produto> findByPrecoLessThanOrNomeContainingIgnoreCase(double preco, String nome);

    long countByPrecoGreaterThan(double preco);
}
