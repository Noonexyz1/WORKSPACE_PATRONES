package org.example.proxy;

import org.example.proxy.port.ServicioMensaje;

//Clase Proxy
public class ServicioMensajeImplProxy implements ServicioMensaje {

    //Un proxy controla el acceso al objeto original, permitiéndote hacer algo antes
    // o después de que la solicitud llegue al objeto original.
    private ServicioMensaje servicioMensaje;

    public ServicioMensajeImplProxy(ServicioMensaje servicioMensaje) {
        this.servicioMensaje = servicioMensaje;
    }

    public void setServicioMensaje(ServicioMensaje servicioMensaje) {
        this.servicioMensaje = servicioMensaje;
    }


    @Override
    public String mensaje(String persona) {
        //se ejecuta antes o despues de que el objeto haga algo
        System.out.println("log del mensaje para "+ persona + " ejecutanto nueva accion...");

        //mensaje delegado
        return servicioMensaje.mensaje(persona);
    }
}
