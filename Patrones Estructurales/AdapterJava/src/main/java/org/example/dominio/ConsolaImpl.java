package org.example.dominio;

public class ConsolaImpl implements Consola {
    private USBJoystick usbJoystick;

    @Override
    public void prenderConsola() {
        System.out.println("Consola Prendida");
    }
    @Override
    public void apagarConsola() {
        System.out.println("Consola Apagada");
    }
    @Override
    public void conectarUSBJoystick(USBJoystick usbJoystick) {
        if (usbJoystick != null) {
            this.usbJoystick = usbJoystick;
            System.out.println("USBJoystick conectado");
            usbJoystick.connectToUSB();
        }
    }
    @Override
    public void leerDatosDeUSBJoystick() {
        double dato = usbJoystick.readData();
        System.out.println("Los datos leidos son: " + dato);
    }

}
