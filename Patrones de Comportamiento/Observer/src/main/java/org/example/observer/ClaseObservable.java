package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class ClaseObservable implements Observable {

    private List<Observador> listaObservadores = new ArrayList<>();


    @Override
    public void addObservador(Observador o) {
        this.listaObservadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        this.listaObservadores.remove(o);
    }

    @Override
    public void notificarALosObservadores() {
        listaObservadores.stream().forEach(observador -> observador.actualizar());
    }
}
