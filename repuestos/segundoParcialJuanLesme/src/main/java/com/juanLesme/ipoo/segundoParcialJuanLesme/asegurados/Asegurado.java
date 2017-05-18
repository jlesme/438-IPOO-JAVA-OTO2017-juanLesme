package com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados;

import com.juanLesme.ipoo.segundoParcialJuanLesme.personas.Persona;

public class Asegurado extends Persona {
		
	private Persona Persona;
	
	public void agregarItemHistorial(HistorialMedico h){
		
	}
	public void elimnarItemHistorial(HistorialMedico h){
		
	}
	public <id> void elimnarItemHistorial(id h){
		
	}

	
	//constructor 1
	public Asegurado(){
		
	}
	
	//constructor 2
	public Asegurado(com.juanLesme.ipoo.segundoParcialJuanLesme.personas.Persona persona) {
		super();
		Persona = persona;
	}
	
	//metodo
	public Persona getPersona() {
		return Persona;
	}

	public void setPersona(Persona persona) {
		Persona = persona;
	}

}
