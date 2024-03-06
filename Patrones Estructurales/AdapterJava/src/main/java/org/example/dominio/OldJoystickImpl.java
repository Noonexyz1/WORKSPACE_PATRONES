package org.example.dominio;

public class OldJoystickImpl implements OldJoystick {
    @Override
    public void connectToPort() {
        System.out.println("Conectando al PORT...");
    }
    @Override
    public double readInputs() {
        return Math.random();
    }
}
