package org.example.port;

import org.example.impl.Aburrido;

// Mi clase Context
public class Tamagotchi {

    private State estado;

    // Estado inicial
    public Tamagotchi() {
        setState(new Aburrido());
    }

    // Para establecer algun estado
    public void setState(State estado) {
        this.estado = estado;
        this.estado.setTamagotchi(this);
    }


    // Metodos de clase
    public void alimentar() {
        this.estado.alimentar();
    }

    public void dormir() {
        this.estado.dormir();
    }

    public void jugar() {
        this.estado.jugar();
    }

    public void comoEstas() {
        this.estado.comoEstas();
    }
}
