package org.example.impl;

import org.example.port.IEquipo;

// puedo implementar cualquier equipo con la interface
public class ParisSaintGermany implements IEquipo {

	@Override
	public void mostrarNombreDelEquipo() {
		System.out.println("PARIS SAINT GERMAN");
	}

	@Override
	public void mostrarDineroDelEquipo() {
		System.out.println("PARIS SAINT GERMAN tiene 300 MILLONES DE EUROS");
	}

	// Otros metodos de la clase
}
