package org.example;

import org.example.impl.Barcelona;
import org.example.service.Messi;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("------INJECCION DE DEPENDENCIAS-----");
	
		Messi m = new Messi(new Barcelona());
		//Messi m = new Messi(new ParisSaintGermany());
		m.mostrarEquipo();
		m.mostrarDineroEquipo();

		m.metodoLocalMessi();
	}
}
