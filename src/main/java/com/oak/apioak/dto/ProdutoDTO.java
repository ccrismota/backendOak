package com.oak.apioak.dto;

public class ProdutoDTO {
		
		private int codigoProduto;
		private String nomeProduto;
		private String descricaoProduto;
		private double valorProduto;
		private boolean disponibilidade;
		
			
		public int getCodigoProduto() {
			return codigoProduto;
		}
		public void setCodigoProduto(int codigoProduto) {
			this.codigoProduto = codigoProduto;
		}
		public String getNomeProduto() {
			return nomeProduto;
		}
		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}
		public String getDescricaoProduto() {
			return descricaoProduto;
		}
		public void setDescricaoProduto(String descricaoProduto) {
			this.descricaoProduto = descricaoProduto;
		}
		public double getValorProduto() {
			return valorProduto;
		}
		public void setValorProduto(double valorProduto) {
			this.valorProduto = valorProduto;
		}
		public boolean isDisponibilidade() {
			return disponibilidade;
		}
		public void setDisponibilidade(boolean disponibilidade) {
			this.disponibilidade = disponibilidade;
		}
}
