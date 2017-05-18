package com.juanLesme.ipoo.segundoParcialJuanLesme.polizas;

import java.util.Date;
import java.util.List;

public class Poliza {
	
	private Long id;
	private Date fechaHoraEmision;
	private Date fechaInicio;
	private Date fechaFin;
	private Double capitalAsegurado;
	private Double importeTotal;
	private Double cuota;
	private Date fechaVencimientoCuota;
	
	private List<Agente> Agente;
	private List<AccesoAgente> AccesoAgente;

	
	public Poliza(){
		
	}

	public Poliza(Long id, Date fechaHoraEmision, Date fechaInicio, Date fechaFin, Double capitalAsegurado,
			Double importeTotal, Double cuota, Date fechaVencimientoCuota) {
		super();
		this.id = id;
		this.fechaHoraEmision = fechaHoraEmision;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.capitalAsegurado = capitalAsegurado;
		this.importeTotal = importeTotal;
		this.cuota = cuota;
		this.fechaVencimientoCuota = fechaVencimientoCuota;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaHoraEmision() {
		return fechaHoraEmision;
	}

	public void setFechaHoraEmision(Date fechaHoraEmision) {
		this.fechaHoraEmision = fechaHoraEmision;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getCapitalAsegurado() {
		return capitalAsegurado;
	}

	public void setCapitalAsegurado(Double capitalAsegurado) {
		this.capitalAsegurado = capitalAsegurado;
	}

	public Double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(Double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public Double getCuota() {
		return cuota;
	}

	public void setCuota(Double cuota) {
		this.cuota = cuota;
	}

	public Date getFechaVencimientoCuota() {
		return fechaVencimientoCuota;
	}

	public void setFechaVencimientoCuota(Date fechaVencimientoCuota) {
		this.fechaVencimientoCuota = fechaVencimientoCuota;
	}


}
