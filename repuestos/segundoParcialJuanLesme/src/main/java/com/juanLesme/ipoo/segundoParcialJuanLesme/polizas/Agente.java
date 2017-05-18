package com.juanLesme.ipoo.segundoParcialJuanLesme.polizas;

import java.util.List;

public class Agente {
	private Long id;
	private String usuario;
	private String contraseña;
	private List<Agente> Agente;
	
	public Agente(){
		
	}

	public Agente(Long id, String usuario, String contraseña, List<Agente> agente) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
		Agente = agente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public List<Agente> getAgente() {
		return Agente;
	}

	public void setAgente(List<Agente> agente) {
		Agente = agente;
	}

}
