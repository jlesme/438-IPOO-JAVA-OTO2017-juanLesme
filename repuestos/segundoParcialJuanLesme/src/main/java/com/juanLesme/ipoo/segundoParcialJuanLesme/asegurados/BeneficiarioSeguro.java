package com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados;

import java.util.List;

public class BeneficiarioSeguro {
	
	private Long id;
	private Integer porcentaje;
	private List<Beneficiario> Beneficiario;
	private List<TipoRelacion> TipoRelacion;
	
	public BeneficiarioSeguro(){
		
	}

	public BeneficiarioSeguro(Long id, Integer porcentaje) {
		super();
		this.id = id;
		this.porcentaje = porcentaje;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}
	

}
