package clases;

// AbstracT Builder
public abstract class AbstractPizzaBuilder {
	
	//clase producto
	protected Pizza pizza;
	
	public AbstractPizzaBuilder() {
		// Ejecutando constructor vacio PRUEBA
		System.out.println("AbstractPizzaBuilder.AbstractPizzaBuilder() constructor");
	}
	
	public void crearNuevaPizza() {
		System.out.println("AbstractPizzaBuilder.crearNuevaPizza()");
		pizza = new Pizza();
	}

	public Pizza getPizza() {
		System.out.println("AbstractPizzaBuilder.getPizza()");
		return pizza;
	}

	public abstract void buildMasa();
	public abstract void buildSalsa();
	public abstract void buildRelleno();
	
}
