package org.example.adapter.serviceIncompatible;

//NO TOCAR
public class LamparaInglesa {
    //Lamentablemente nuestra Lampara inglesa es un código creado por un programador ajeno a la
    // empresa y construyo lo que le dio la gana. Así son las cosas.
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }
    public void on () {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

}
