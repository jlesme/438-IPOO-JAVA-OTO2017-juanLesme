package com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados;

public class Medico {
	
	private Long id;
	private String nombre;
	
	public Medico(){
		
	}

	public Medico(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
