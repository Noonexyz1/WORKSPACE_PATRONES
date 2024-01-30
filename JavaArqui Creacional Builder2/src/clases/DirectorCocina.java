package clases;

// Clase Directora
public class DirectorCocina {
	// mi clase mas general
	private AbstractPizzaBuilder abstractPizzaBuilder;

	public Pizza getPizza() {
		System.out.println("DirectorCocina.getPizza()");
		return abstractPizzaBuilder.getPizza();
	}

	// Abstrac Builder en general, POLIMORFISMO en este parametro
	// pueder ser un HawaiPizzaBuilder o el otro, ya que heredan de AbstractPizzaBuilder
	public void setAbstractPizzaBuilder(AbstractPizzaBuilder abstractPizzaBuilder) {
		System.out.println("DirectorCocina.setAbstractPizzaBuilder()");
		this.abstractPizzaBuilder = abstractPizzaBuilder;
	}
	
	// basandose en el polimorfismo, ambos tienen los mismos metodos
	public void construirPizza() {
		System.out.println("DirectorCocina.construirPizza()");
		abstractPizzaBuilder.crearNuevaPizza();
		abstractPizzaBuilder.buildMasa();
		abstractPizzaBuilder.buildSalsa();
		abstractPizzaBuilder.buildRelleno();

	}

	
	
	// toString PRUEBA
	@Override
	public String toString() {
		return "DirectorCocina [abstractPizzaBuilder=" + abstractPizzaBuilder + "]";
	}
	
	
	
	
	
	
}
