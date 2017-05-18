package com.juanLesme.ipoo.segundoParcialJuanLesme.personas;

import java.util.Date;

public class Persona {

	private Long id;
	private String nombre;
	private String lugarDeNacimiento;
	private Date nacionalidad;
	private String tipoDoc;
	private String direccion;
	private String telefono;
	
	//constructor 1
	public Persona(){
		
	}
	
	//constructor2
	public Persona(Long id, String nombre, String lugarDeNacimiento, Date nacionalidad, String tipoDoc,
			String direccion, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.lugarDeNacimiento = lugarDeNacimiento;
		this.nacionalidad = nacionalidad;
		this.tipoDoc = tipoDoc;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//metodo
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

	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public Date getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Date nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}

