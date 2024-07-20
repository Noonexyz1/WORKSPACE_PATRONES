package org.example.service;

import org.example.port.IEquipo;

// Invocador de patron Command o Contexto de patron Strategy o Adaptador
// de Adapter (pero esta vez Adaptador NO, por que vemos que esta clase no implementa una interfaz para adaptar)
public class Messi {

	// Esto esta fuertemente ligado a esta clase
	//private Barcelona bar = new Barcelona();
	//private Barcelona barcelona;

	// Estamos dependiendo de una abstraction
	//estoy diciendo, "Messi puede jugar en un equipo"
	private IEquipo equipo;
	
	// Injeccion por Constructor
	public Messi(IEquipo equipo) {
		this.equipo = equipo;
	}

	// Injeccion por Metodo
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	public IEquipo getEquipo() {
		return equipo;
	}


	// Metodo que depende de una Abstraccion
	public void mostrarEquipo() {
		equipo.mostrarNombreDelEquipo();
	}

	// Metodo que depende de una Abstraccion
	public void mostrarDineroEquipo() {
		equipo.mostrarDineroDelEquipo();
	}


	// Metodo propio de la clase
	public void metodoLocalMessi() {
		System.out.println("Metodo logal de clase Messi");
	}
}
