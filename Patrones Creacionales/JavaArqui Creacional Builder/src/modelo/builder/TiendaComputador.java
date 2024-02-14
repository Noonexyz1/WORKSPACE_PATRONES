package modelo.builder;

import modelo.Computador;

public class TiendaComputador {
	
	private ComputadoresBuilder builder;
	
	public void setBuilder(ComputadoresBuilder builder) {
		this.builder = builder;
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
	
	public void construirComputador() {
		builder.crearComputador();
		builder.buildMarca();
		builder.buildProcesador();
		builder.buildRam();
	}
	
}
