package org.example.adapter;

import org.example.adapter.interfaces.Conectable;

public class AdaptadorLampara implements Conectable {

    private LamparaInglesa lampara = new LamparaInglesa();

    //Adaptamos sus metodos originales a los metodos que necesite
    @Override
    public boolean estaEncendida() {
        return lampara.isOn();
    }
    @Override
    public void encender() {
        lampara.on();
    }
    @Override
    public void apagar() {
        lampara.off();
    }

}
