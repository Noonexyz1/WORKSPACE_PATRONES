package org.example.observer;

public class ClaseObservadorNr2 implements Observador {
    @Override
    public void actualizar() {
        System.out.println("Se ha llamado a la clase Nr 2");
    }
}
