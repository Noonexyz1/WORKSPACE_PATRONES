package clases;

// Concrete Builder
public class HawaiPizzaBuilder extends AbstractPizzaBuilder{

	@Override
	public void buildMasa() {
		System.out.println("HawaiPizzaBuilder.buildMasa()");
		pizza.setMasa("suave");
	}

	@Override
	public void buildSalsa() {
		System.out.println("HawaiPizzaBuilder.buildSalsa()");
		pizza.setSalsa("dulce");
	}

	@Override
	public void buildRelleno() {
		System.out.println("HawaiPizzaBuilder.buildRelleno()");
		pizza.setRelleno("chorizo + alcachofas");
	}

	
	
	
	// to String de PRUEBA
	@Override
	public String toString() {
		return "HawaiPizzaBuilder [pizza=" + pizza + "]";
	}

	
	
}
