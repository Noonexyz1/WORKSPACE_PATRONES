package org.example.proxy;

import org.example.proxy.port.ServicioMensaje;

//NO TOCAR
public class ServicioMensajeImpl implements ServicioMensaje {

    @Override
    public String mensaje(String persona) {
        return "Hola amigo "+ persona;
    }
}
