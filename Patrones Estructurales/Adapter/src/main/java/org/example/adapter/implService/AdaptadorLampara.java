package org.example.adapter.implService;

import org.example.adapter.port.Conectable;
import org.example.adapter.serviceIncompatible.LamparaInglesa;

public class AdaptadorLampara implements Conectable {

    private LamparaInglesa lampara;

    public AdaptadorLampara(LamparaInglesa lampara){
        this.lampara = lampara;
    }


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
