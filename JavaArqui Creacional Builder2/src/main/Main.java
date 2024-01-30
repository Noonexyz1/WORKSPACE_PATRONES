package main;

import clases.AbstractPizzaBuilder;
import clases.DirectorCocina;
import clases.HawaiPizzaBuilder;
import clases.PicantePizzaBuilder;
import clases.Pizza;

public class Main {

	public static void main(String[] args) {
		// director
		DirectorCocina cocina = new DirectorCocina();
		System.out.println("Main.main() + COCINA " + cocina.toString());
	
		//referencias mas generales
		AbstractPizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
		System.out.println("Main.main() + " + hawaiPizzaBuilder.toString());
		//AbstractPizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();
		
		cocina.setAbstractPizzaBuilder(hawaiPizzaBuilder);
		System.out.println("Main.main() + COCINA " + cocina.toString());
		cocina.construirPizza();
		System.out.println("Main.main() + " + hawaiPizzaBuilder.toString());
		
		// clase producto
		Pizza pizza = cocina.getPizza();
		System.out.println("Main.main() objeto" + pizza.toString());
		
	}

}
