package modelo.builder;


public class ComputadorAMDBuilder extends ComputadoresBuilder {
	
	@Override
	public void buildMarca() {
		computador.setMarca("AMD");
	}

	@Override
	public void buildProcesador() {
		computador.setPorcesador("B12-706");
	}

	@Override
	public void buildRam() {
		computador.setRam(15);
	}

	
}
