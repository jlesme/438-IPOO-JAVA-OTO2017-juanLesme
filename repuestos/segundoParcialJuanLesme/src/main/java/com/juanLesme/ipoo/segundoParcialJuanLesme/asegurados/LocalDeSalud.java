package com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados;

public class LocalDeSalud {
	
	private Long id;
	private String nombre;
	private String direccion;
	private String telefonia;
	
	public LocalDeSalud(){
		
	}

	public LocalDeSalud(Long id, String nombre, String direccion, String telefonia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefonia = telefonia;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefonia() {
		return telefonia;
	}

	public void setTelefonia(String telefonia) {
		this.telefonia = telefonia;
	}
	
	

}
