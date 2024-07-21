package org.example.dominio.port;

public interface Consola {
    void prenderConsola();
    void apagarConsola();
    void conectarUSBJoystick(USBJoystick usbJoystick);
    void leerDatosDeUSBJoystick();
}
