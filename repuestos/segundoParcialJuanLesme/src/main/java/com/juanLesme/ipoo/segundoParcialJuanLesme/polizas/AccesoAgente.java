package com.juanLesme.ipoo.segundoParcialJuanLesme.polizas;

import java.util.Date;

public class AccesoAgente {
	private Long id;
	private Date fechaHoraInicio;
	private Date fechaHoraFin;
	
	public AccesoAgente(){
		
	}

	public AccesoAgente(Long id, Date fechaHoraInicio, Date fechaHoraFin) {
		super();
		this.id = id;
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaHoraInicio() {
		return fechaHoraInicio;
	}

	public void setFechaHoraInicio(Date fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public Date getFechaHoraFin() {
		return fechaHoraFin;
	}

	public void setFechaHoraFin(Date fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}
	
	

}
