package clases;

// Clase Producto
public class Pizza {
	
	private String masa;
	private String salsa;
	private String relleno;
	
	// metodos SETTERS
	public void setMasa(String masa) {
		this.masa = masa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Pizza [masa=" + masa + ", salsa=" + salsa + ", relleno=" + relleno + "]";
	}
	
}
