package com.juanLesme.ipoo.segundoParcialJuanLesme.personas;

public class Propietario extends Persona {
	private Persona Persona;
	
	//constructor1
	public Propietario(){
		
	}
	
	//constructor2
	public Propietario(com.juanLesme.ipoo.segundoParcialJuanLesme.personas.Persona persona) {
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
