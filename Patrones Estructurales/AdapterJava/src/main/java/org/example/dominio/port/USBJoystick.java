package org.example.dominio.port;

public interface USBJoystick {
    void connectToUSB();
    double readData();
}
