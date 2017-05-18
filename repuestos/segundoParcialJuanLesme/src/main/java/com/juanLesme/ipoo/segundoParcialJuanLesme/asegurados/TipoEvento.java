package com.juanLesme.ipoo.segundoParcialJuanLesme.asegurados;

public class TipoEvento {

		private Long id;
		private String nombre;
		
		public TipoEvento(){
			
		}

		public TipoEvento(Long id, String nombre) {
			super();
			this.id = id;
			this.nombre = nombre;
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
		
		
}
