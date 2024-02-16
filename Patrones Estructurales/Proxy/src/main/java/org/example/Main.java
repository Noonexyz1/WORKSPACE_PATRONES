package org.example;

import org.example.proxy.ServicioMensajeProxy;
import org.example.proxy.interfaces.ServicioMensaje;

public class Main {
    public static void main(String[] args) {

        ServicioMensaje sm = new ServicioMensajeProxy();
        System.out.println(sm.mensaje("pepito"));

    }

}