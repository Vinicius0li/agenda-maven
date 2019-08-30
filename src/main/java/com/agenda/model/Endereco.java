package com.agenda.model;

public class Endereco {

	private long id;
	private static String logradouro;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public static String getLogradouro() {
		return logradouro;
	}
	public static void setLogradouro(String logradouro) {
		Endereco.logradouro = logradouro;
	}
	
	
	
}