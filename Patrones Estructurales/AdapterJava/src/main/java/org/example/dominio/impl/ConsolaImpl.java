package org.example.dominio.impl;

import org.example.dominio.port.Consola;
import org.example.dominio.port.USBJoystick;

public class ConsolaImpl implements Consola {

    private USBJoystick usbJoystick;

    @Override   //Esto hace de Injector
    public void conectarUSBJoystick(USBJoystick usbJoystick) {
        if (usbJoystick != null) {
            this.usbJoystick = usbJoystick;
            System.out.println("Un Joystick a sido conectado y reconocido con exito");
            usbJoystick.connectToUSB();
        }
    }

    // Lo de prender y apagar son ESTADOS de una Consola (State), pero esto
    // es solo un ejemplo va? :)
    @Override
    public void prenderConsola() {
        System.out.println("Consola Prendida");
    }

    @Override
    public void apagarConsola() {
        System.out.println("Consola Apagada");
    }

    @Override
    public void leerDatosDeUSBJoystick() {
        double dato = usbJoystick.readData();
        System.out.println("Los datos leidos son: " + dato);
    }

}
