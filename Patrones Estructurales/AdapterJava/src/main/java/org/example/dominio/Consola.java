package org.example.dominio;

public interface Consola {
    void prenderConsola();
    void apagarConsola();
    void conectarUSBJoystick(USBJoystick usbJoystick);
    void leerDatosDeUSBJoystick();
}
