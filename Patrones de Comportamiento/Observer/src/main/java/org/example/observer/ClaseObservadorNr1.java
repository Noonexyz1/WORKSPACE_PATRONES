package org.example.observer;

public class ClaseObservadorNr1 implements Observador {
    @Override
    public void actualizar() {
        //este metodo se dispara cuando el ObserABLE cambiar
        System.out.println("Se ha llamado a la clase Nr 1");
    }
}
