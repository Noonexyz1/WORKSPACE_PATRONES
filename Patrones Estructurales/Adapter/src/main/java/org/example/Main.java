package org.example;

import org.example.adapter.AdaptadorLampara;
import org.example.adapter.Lampara;
import org.example.adapter.Ordenador;
import org.example.adapter.interfaces.Conectable;

public class Main {
    public static void main(String[] args) {

        //Hacemos instancias normalmente
        Conectable l1 = new Lampara();
        encenderAparato(l1);

        Conectable o1 = new Ordenador();
        encenderAparato(o1);


        /*Pero nos piden que hagamos lo mismo con una lampara inglesa.
        El metodo encenderAparato() nos pide un Conectable, osea, una implementacion de Conectable
        pero la clase AdaptadorLamapara no lo hace*/
        Conectable l2 = new AdaptadorLampara();
        encenderAparato(l2);

    }
    private static void encenderAparato(Conectable l1) {
        l1.encender();
        System.out.println(l1.estaEncendida());
    }

}