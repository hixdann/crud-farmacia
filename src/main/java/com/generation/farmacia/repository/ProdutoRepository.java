package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByItemContainingIgnoreCase(@Param("item") String item);
	
	public List<Produto> findAllByPrecoBetween(BigDecimal precoMin, BigDecimal precoMax);

}
