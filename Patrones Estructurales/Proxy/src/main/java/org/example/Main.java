package org.example;

import org.example.proxy.ServicioMensajeImpl;
import org.example.proxy.ServicioMensajeProxy;
import org.example.proxy.interfaces.ServicioMensaje;

public class Main {
    public static void main(String[] args) {
        //Instanciacion normal
        ServicioMensaje sm1 = new ServicioMensajeImpl();
        System.out.println(sm1.mensaje("Juan"));;

        /*Me piden que ejecute una accion antes o despues de llamar al metodo en concreto*/
        ServicioMensaje sm = new ServicioMensajeProxy();
        System.out.println(sm.mensaje("Juan"));

    }

}