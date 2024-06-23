package com.oak.apioak.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oak.apioak.dto.ProdutoDTO;
import com.oak.apioak.entity.ProdutoEntity;
import com.oak.apioak.services.ProdutoService;

@RestController
@CrossOrigin(origins = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/api/produto")
	public ResponseEntity<List<ProdutoEntity>> listarprodutos() {
		return ResponseEntity.ok(service.listarTodosProdutos());
	}
	
	@GetMapping("/api/produto/{codigo}")
	public ResponseEntity<ProdutoDTO> listarproduto(@PathVariable int codigo) {
		ProdutoDTO obj = service.listarProdutos(codigo);
		return ResponseEntity.ok(obj);
	}
	
	@PostMapping("/api/produto")
	public ResponseEntity<String> cadastrarProduto(@RequestBody ProdutoDTO objDto){
		String mensagem = service.cadastrarProduto(objDto);
		return ResponseEntity.ok(mensagem);
	}
	
	
}
