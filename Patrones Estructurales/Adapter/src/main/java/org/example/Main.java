package org.example;

import org.example.adapter.implService.AdaptadorLampara;
import org.example.adapter.implService.Lampara;
import org.example.adapter.implService.Ordenador;
import org.example.adapter.port.Conectable;
import org.example.adapter.serviceIncompatible.LamparaInglesa;

public class Main {
    public static void main(String[] args) {

        //Hacemos instancias normalmente
        Conectable l1 = new Lampara();
        encenderAparato(l1);

        Conectable o1 = new Ordenador();
        encenderAparato(o1);

        //no se puede porque LamparaInglesa no implementa un Conectable
        /*Conectable l2 = new LamparaInglesa();
        encenderAparato(l2);*/

        //Pero nos piden que hagamos lo mismo con una lampara inglesa, hacemos un adapter
        //que implemente ese Conectable
        //Lo hacemos para injectar, porque quiza esta clase dependa de otras dependencias
        LamparaInglesa lamparaInglesa = new LamparaInglesa();
        Conectable l2 = new AdaptadorLampara(lamparaInglesa);
        encenderAparato(l2);

    }

    //El metodo encenderAparato() nos pide un Conectable, osea, una implementacion de Conectable
    private static void encenderAparato(Conectable l1) {
        l1.encender();
        System.out.println(l1.estaEncendida());
    }
}