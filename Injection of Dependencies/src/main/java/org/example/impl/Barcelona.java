package org.example.impl;

import org.example.port.IEquipo;

// puedo implementar cualquier equipo con la interface
public class Barcelona implements IEquipo {

	@Override
	public void mostrarNombreDelEquipo() {
		System.out.println("BARCELONA FC");
	}

	@Override
	public void mostrarDineroDelEquipo() {
		System.out.println("BARCELONA FC tiene 200 MILLONES DE EUROS");
	}

	// Otros metodos de la clase
}
