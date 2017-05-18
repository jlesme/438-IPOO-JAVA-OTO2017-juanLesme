package com.juanLesme.ipoo.segundoParcialJuanLesme.personas;

import java.util.List;

public class LugarDeTrabajo {
	private String puesto;
	private Double ingresos;
	private String antiguedad;
	private List<Empresa> Persona;
	
	//constructor1
	public LugarDeTrabajo(){
		
	}
	
	//constructor2
	public LugarDeTrabajo(String puesto, Double ingresos, String antiguedad) {
		super();
		this.puesto = puesto;
		this.ingresos = ingresos;
		this.antiguedad = antiguedad;
	}

	//metodo
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Double getIngresos() {
		return ingresos;
	}

	public void setIngresos(Double ingresos) {
		this.ingresos = ingresos;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	
}
