package com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados;

import java.util.List;

public class HistorialMedico {
	private Long id;
	private String nombre;
	
	private List<TipoEvento> TipoEvento;
	private List<LocalDeSalud> LocalDeSalud;
	private List<Medico> Medico;
	
	public HistorialMedico(){
		
	}

	public HistorialMedico(Long id, String nombre,
			List<com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados.TipoEvento> tipoEvento,
			List<com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados.LocalDeSalud> localDeSalud,
			List<com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados.Medico> medico) {
		super();
		this.id = id;
		this.nombre = nombre;
		TipoEvento = tipoEvento;
		LocalDeSalud = localDeSalud;
		Medico = medico;
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

	public List<TipoEvento> getTipoEvento() {
		return TipoEvento;
	}

	public void setTipoEvento(List<TipoEvento> tipoEvento) {
		TipoEvento = tipoEvento;
	}

	public List<LocalDeSalud> getLocalDeSalud() {
		return LocalDeSalud;
	}

	public void setLocalDeSalud(List<LocalDeSalud> localDeSalud) {
		LocalDeSalud = localDeSalud;
	}

	public List<Medico> getMedico() {
		return Medico;
	}

	public void setMedico(List<Medico> medico) {
		Medico = medico;
	}
	
	
	

}
