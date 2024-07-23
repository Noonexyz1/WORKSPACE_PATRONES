package org.example;

import org.example.proxy.ServicioMensajeImpl;
import org.example.proxy.ServicioMensajeImplProxy;
import org.example.proxy.port.ServicioMensaje;

public class Main {

    public static void main(String[] args) {
        // Instanciacion normal
        ServicioMensaje serviMensaje = new ServicioMensajeImpl();
        System.out.println(serviMensaje.mensaje("Juan"));

        // Me piden que ejecute una accion antes o despues de llamar al metodo
        // en concreto
        ServicioMensaje serviMensaje2 = new ServicioMensajeImplProxy(serviMensaje);
        System.out.println(serviMensaje2.mensaje("Juan"));
    }
}