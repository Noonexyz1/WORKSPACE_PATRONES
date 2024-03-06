package org.example.dominio;

public class USBJoystickImpl implements USBJoystick {
    @Override
    public void connectToUSB() {
        System.out.println("Conectar a USB...");
    }
    @Override
    public double readData() {
        return Math.random();
    }
}
