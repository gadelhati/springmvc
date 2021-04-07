package com.zrtech.springmvc.model.domain;

public class Uva {
	
	private int idUva;
	
	private String nomeUva;
	
	public Uva(){}
	
	public Uva(int idUva, String nomeUva) {
		super();
		this.idUva = idUva;
		this.nomeUva = nomeUva;
	}
	
	public int getIdUva() {
		return idUva;
	}
	public void setIdUva(int idUva) {
		this.idUva = idUva;
	}
	public String getNomeUva() {
		return nomeUva;
	}
	public void setNomeUva(String nomeUva) {
		this.nomeUva = nomeUva;
	}	
}
