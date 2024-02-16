package org.example;

import org.example.adapter.AdaptadorLampara;
import org.example.adapter.Lampara;
import org.example.adapter.Ordenador;
import org.example.adapter.interfaces.Conectable;

public class Main {
    public static void main(String[] args) {

        Conectable l1 = new Lampara();
        encenderAparato(l1);

        Conectable o1 = new Ordenador();
        encenderAparato(o1);

        Conectable l2 = new AdaptadorLampara();
        encenderAparato(l2);

    }
    private static void encenderAparato(Conectable l1) {
        l1.encender();
        System.out.println(l1.estaEncendida());
    }

}