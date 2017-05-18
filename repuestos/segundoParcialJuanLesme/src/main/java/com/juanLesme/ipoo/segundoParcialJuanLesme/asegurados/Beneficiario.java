package com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados;

import com.juanLesme.ipoo.segundoParcialJuanLesme.personas.Persona;

public class Beneficiario extends Persona {
	private Persona Persona;
	
	public Beneficiario(){
		
	}

	public Beneficiario(com.juanLesme.ipoo.segundoParcialJuanLesme.personas.Persona persona) {
		super();
		Persona = persona;
	}

	public Persona getPersona() {
		return Persona;
	}

	public void setPersona(Persona persona) {
		Persona = persona;
	}
	
	

}
