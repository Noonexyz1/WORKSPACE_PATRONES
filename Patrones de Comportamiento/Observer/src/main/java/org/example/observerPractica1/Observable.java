package org.example.observerPractica1;

public interface Observable {

    void addObserver(Observer gastosBancarios);
    void deleteObserver(Observer gastosBancarios);
    void notifyToObservers();

}
