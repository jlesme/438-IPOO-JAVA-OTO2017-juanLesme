package com.juanLesme.ipoo.segundoParcialJuanLesme.polizas;

public class SeguroHogar extends Poliza {
	
	private Poliza Poliza;

	public SeguroHogar(){
		
	}

	public SeguroHogar(com.juanLesme.ipoo.segundoParcialJuanLesme.polizas.Poliza poliza) {
		super();
		Poliza = poliza;
	}

	public Poliza getPoliza() {
		return Poliza;
	}

	public void setPoliza(Poliza poliza) {
		Poliza = poliza;
	}
	
	
	

}
