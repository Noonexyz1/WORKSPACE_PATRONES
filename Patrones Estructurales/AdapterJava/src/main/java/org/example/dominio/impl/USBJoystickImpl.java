package org.example.dominio.impl;

import org.example.dominio.port.USBJoystick;

public class USBJoystickImpl implements USBJoystick {

    @Override
    public void connectToUSB() {
        System.out.println("Conectado via USB");
    }
    @Override
    public double readData() {
        return Math.random();
    }
}
