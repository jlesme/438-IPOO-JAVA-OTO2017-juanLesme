package com.juanLesme.ipoo.segundoParcialJuanLesme.personas;

import java.util.Date;

public class Cliente extends Persona {
	private Persona Persona;
	private LugarDeTrabajo LugarDeTrabajo;

	//constructor 1
	public Cliente(){
		
	}
	//constructor 2
	public Cliente(com.juanLesme.ipoo.segundoParcialJuanLesme.personas.Persona persona,
			com.juanLesme.ipoo.segundoParcialJuanLesme.personas.LugarDeTrabajo lugarDeTrabajo) {
		super();
		Persona = persona;
		LugarDeTrabajo = lugarDeTrabajo;
	}
	
	//metodo
	public Persona getPersona() {
		return Persona;
	}
	public void setPersona(Persona persona) {
		Persona = persona;
	}

	public LugarDeTrabajo getLugarDeTrabajo() {
		return LugarDeTrabajo;
	}

	public void setLugarDeTrabajo(LugarDeTrabajo lugarDeTrabajo) {
		LugarDeTrabajo = lugarDeTrabajo;
	}
	
	
}
