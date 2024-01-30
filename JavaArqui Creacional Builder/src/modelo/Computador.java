package modelo;

public class Computador {

	private String marca;
	private String porcesador;
	private int ram;
	

	// mi contructor vacio
	public Computador() {
	
	}
	
	// mi constructor
	public Computador(String marca, String porcesador, int ram) {
		this.marca = marca;
		this.porcesador = porcesador;
		this.ram = ram;
	}
	
	// mis getters and setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPorcesador() {
		return porcesador;
	}

	public void setPorcesador(String porcesador) {
		this.porcesador = porcesador;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	
	
	// to String
	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", porcesador=" + porcesador + ", ram=" + ram + "]" + "\n\n";
	}
	
	
}
