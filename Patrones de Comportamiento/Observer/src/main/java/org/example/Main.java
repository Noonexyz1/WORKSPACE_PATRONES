package org.example;

import org.example.observer.ClaseObservable;
import org.example.observer.ClaseObservadorNr1;
import org.example.observer.ClaseObservadorNr2;
import org.example.observer.ClaseObservadorNr3;

public class Main {
    public static void main(String[] args) {
        //Creamos un observable
        ClaseObservable observable = new ClaseObservable();

        //Añadimos los observadores que queramos
        observable.addObservador(new ClaseObservadorNr2());
        observable.addObservador(new ClaseObservadorNr1());
        observable.addObservador(new ClaseObservadorNr3());

        observable.notificarALosObservadores();

    }
}