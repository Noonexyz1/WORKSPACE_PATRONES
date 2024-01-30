package main;

public class Messi {

	// esto esta fuertemente ligado a esta clase
	//private Barcelona bar = new Barcelona();
	
	//private Barcelona barcelona;
	private IEquipo equipo;
	
	// injeccion por Constructor
	public Messi(IEquipo equipo) {
		this.equipo = equipo;
	}

	// injeccion por Metodo
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	
	public void mostrarEquipo() {
		equipo.mostrarNombreDelEquipo();
	}
	
	// metodo aparte
	public void metodoLocalMessi() {

	}
	
}
