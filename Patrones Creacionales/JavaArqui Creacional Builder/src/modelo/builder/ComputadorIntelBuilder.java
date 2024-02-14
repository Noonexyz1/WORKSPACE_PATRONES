package modelo.builder;

public class ComputadorIntelBuilder extends ComputadoresBuilder {

	@Override
	public void buildMarca() {
		computador.setMarca("Intel");
	}

	@Override
	public void buildProcesador() {
		computador.setPorcesador("8-G00");
	}

	@Override
	public void buildRam() {
		computador.setRam(32);
	}

}
