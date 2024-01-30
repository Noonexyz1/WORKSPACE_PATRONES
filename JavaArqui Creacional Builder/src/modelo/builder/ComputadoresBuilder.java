package modelo.builder;

import modelo.Computador;

public abstract class ComputadoresBuilder {
	
	protected Computador computador;
	
	public Computador getComputador() {
		return computador;
	}
	
	public void crearComputador() {
		computador = new Computador();
	}
	
	
	public abstract void buildMarca();
	
	public abstract void buildProcesador();
	
	public abstract void buildRam();
	
}
