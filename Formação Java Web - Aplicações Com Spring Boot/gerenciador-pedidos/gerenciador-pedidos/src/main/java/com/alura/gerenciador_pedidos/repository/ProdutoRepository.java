package com.alura.gerenciador_pedidos.repository;

import com.alura.gerenciador_pedidos.model.Categoria;
import com.alura.gerenciador_pedidos.model.Produto;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.JpqlQueryBuilder;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    List<Produto> findTop3ByOrderByPrecoDesc();

    List<Produto> findTop5ByCategoria_NomeOrderByPreco(String categoria);

    @Query("SELECT p FROM Produto p " +
            "WHERE p.preco > :valor")
    List<Produto> produtosValorMinimo(Double valor);

    @Query("SELECT p FROM Produto p " +
            "ORDER BY p.preco DESC")
    List<Produto> produtosOrdenadosPorPreco();

    @Query("SELECT p FROM Produto p " +
            "ORDER BY p.preco ASC")
    List<Produto> produtosOdernadosPorPrecoDecrescente();

    @Query("SELECT p FROM Produto p " +
            "WHERE p.nome ILIKE :letra%")
    List<Produto> listarProdutosComLetra(String letra);

    @Query("SELECT AVG(p.preco) FROM Produto p")
    Double retornaMediaPrecoProdutos();

    @Query("SELECT p FROM Produto p " +
            "WHERE p.categoria.nome ILIKE :categoria " +
            "ORDER BY p.preco DESC LIMIT 1")
    Optional<Produto> retornaMaisCaroDaCategoria(@Param("categoria") String categoria);

    @Query("SELECT p.categoria.nome, count(p) FROM Produto p " +
            "GROUP BY p.categoria")
    List<Tuple> ContagemDeProdutosPorCategoria();

    @Query("SELECT c, count(p.categoria) FROM Produto p " +
            "JOIN p.categoria c " +
            "GROUP BY c " +
            "HAVING count(p.categoria) > :numeroMinimo")
    List<Tuple> retornaCategoriasComMinomoDeProdutos(long numeroMinimo);
}
