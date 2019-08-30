package com.agenda.model;

public class Contato {

	private long id;
	private static String email;
	private static String telefone;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Contato.email = email;
	}
	public static String getTelefone() {
		return telefone;
	}
	public static void setTelefone(String telefone) {
		Contato.telefone = telefone;
	}
	
	
	
	}
	

