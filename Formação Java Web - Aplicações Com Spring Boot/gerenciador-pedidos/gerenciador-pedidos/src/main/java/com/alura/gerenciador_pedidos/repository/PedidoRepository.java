package com.alura.gerenciador_pedidos.repository;

import com.alura.gerenciador_pedidos.model.Pedido;
import com.alura.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByDataIsNull();

    List<Pedido> findByDataIsNotNull();

    List<Pedido> findByDataAfter(LocalDate data);

    List<Pedido> findByDataBefore(LocalDate data);

    List<Pedido> findByDataBetween(LocalDate dataInicial, LocalDate dataFinal);

    @Query("SELECT p FROM Pedido p " +
            "WHERE p.data >= :data1Formatada " +
            "AND p.data <= :data2Formatada")
    List<Pedido> listarPedidosEntreData(@Param("data1Formatada") LocalDate primeiraData, @Param("data2Formatada") LocalDate segundaData);
}
