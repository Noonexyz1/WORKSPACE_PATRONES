package org.example.adapter.implService;

import org.example.adapter.port.Conectable;

public class Lampara implements Conectable {

    private boolean encendida;

    @Override
    public boolean estaEncendida() {
        return encendida;
    }
    @Override
    public void encender() {
        encendida = true;
    }
    @Override
    public void apagar() {
        encendida = false;
    }

}
