package com.oak.apioak.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.oak.apioak.entity.ProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer>, 
JpaSpecificationExecutor<ProdutoEntity> {
	Optional<ProdutoEntity> findByCodigo(ProdutoEntity codigo);
}
