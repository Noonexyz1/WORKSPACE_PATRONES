package org.example.port;

import org.example.impl.HappyState;

// Clase Contexto, no es un adapter porque esta no implementa una interfaz
// Esto es mi servicio
public class VirtualPet {

    private PetState state;

    // Estado inicial
    public VirtualPet() {
        state = new HappyState();
    }

    // Se necesita este SET para establecer distintos estados de esta clase
    public void setState(PetState state) {
        this.state = state;
    }



    public void feed() {
        state.feed(this);
    }

    public void play() {
        state.play(this);
    }

    public void rest() {
        state.rest(this);
    }
}
