package org.example.proxy;

import org.example.proxy.interfaces.ServicioMensaje;

public class ServicioMensajeProxy implements ServicioMensaje {
    //Un proxy controla el acceso al objeto original, permitiéndote hacer algo antes
    // o después de que la solicitud llegue al objeto original.
    private ServicioMensaje sm;

    public ServicioMensajeProxy() {
        super();
        this.sm = new ServicioMensajeImpl();
    }

    @Override
    public String mensaje(String persona) {
        //se ejecuta antes o despues de que el objeto haga algo
        System.out.println("log del mensaje para "+ persona);
        //mensaje delegado
        return sm.mensaje(persona);
    }

}
