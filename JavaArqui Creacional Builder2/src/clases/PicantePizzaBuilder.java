package clases;

// Concrete Builder
public class PicantePizzaBuilder extends AbstractPizzaBuilder{

	@Override
	public void buildMasa() {
		pizza.setMasa("cocida");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("picante");
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno("pinienta + salchichon");		
	}

}
