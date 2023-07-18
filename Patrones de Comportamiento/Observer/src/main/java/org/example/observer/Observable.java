package org.example.observer;

public interface Observable {
    void addObservador(Observador o);
    void eliminarObservador(Observador o);
    void notificarALosObservadores();

}
