package main;

// puedo implementar cualquier equipo con la interface
public class Barcelona implements IEquipo{

	public void mostrar() {
		System.out.println("BARCELONA FC");
	}

	@Override
	public void mostrarNombreDelEquipo() {
		System.out.println("BARCELONA FC");
	}

	@Override
	public void mostrarDineroDelEquipo() {
		// sin implementar
	}
	
	
	public void metodoLocal() {
		System.out.println("Barcelona.metodoLocal() debo mostrar esto");
	}
	
}
