package com.zrtech.springmvc.model.domain;

public class Vinho {
	
	private int idVinho;
	
	private String nomeVinho;
	
	private int ano;
	
	private String tipo;
	
	private int qtdEstoque;
	
	private double preco;
	
	private Uva uva;		

	public Vinho() {}

	public Vinho(String nomeVinho, int ano, String tipo, Uva uva, int qtdEstoque, double preco) {
		super();
		this.nomeVinho = nomeVinho;
		this.ano = ano;
		this.tipo = tipo;
		this.uva = uva;
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
	}

	public int getIdVinho() {
		return idVinho;
	}
	public void setIdVinho(int idVinho) {
		this.idVinho = idVinho;
	}
	public String getNomeVinho() {
		return nomeVinho;
	}
	public void setNomeVinho(String nomeVinho) {
		this.nomeVinho = nomeVinho;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Uva getUva() {
		return uva;
	}
	public void setUva(Uva uva) {
		this.uva = uva;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}	

}
