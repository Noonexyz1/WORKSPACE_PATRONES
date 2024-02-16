package org.example.proxy;

import org.example.proxy.interfaces.ServicioMensaje;

public class ServicioMensajeImpl implements ServicioMensaje {

    @Override
    public String mensaje(String persona) {
        return "Hola amigo "+ persona;
    }

}
