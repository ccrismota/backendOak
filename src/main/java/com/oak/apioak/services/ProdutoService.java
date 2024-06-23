package com.oak.apioak.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oak.apioak.dto.ProdutoDTO;
import com.oak.apioak.entity.ProdutoEntity;
import com.oak.apioak.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public String cadastrarProduto(ProdutoDTO objDto) {
		ProdutoEntity entity = new ProdutoEntity();
		entity.setCodigo(objDto.getCodigoProduto());
		entity.setNomeProduto(objDto.getNomeProduto());
		entity.setDescricaoProduto(objDto.getDescricaoProduto());
		entity.setValorProduto(objDto.getValorProduto());
		entity.setDisponibilidade(objDto.isDisponibilidade());
		repository.save(entity);
		return "Produto cadastrado com sucesso!";
	}

	public List<ProdutoEntity> listarTodosProdutos() {
		return repository.findAll();
	}

	public ProdutoDTO listarProdutos(int codigo) {
		ProdutoDTO objDto = new ProdutoDTO();
		Optional<ProdutoEntity> retorno = repository.findById(codigo);
		if (retorno.isPresent()) {
			objDto.setCodigoProduto(retorno.get().getCodigo());
			objDto.setNomeProduto(retorno.get().getNomeProduto());
			objDto.setDescricaoProduto(retorno.get().getDescricaoProduto());
			objDto.setValorProduto(retorno.get().getValorProduto());
			objDto.setDisponibilidade(retorno.get().isDisponibilidade());
		}
		return objDto;
	}

}
