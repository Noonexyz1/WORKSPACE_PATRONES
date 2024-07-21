package org.example.dominio.incompatible;

import org.example.dominio.port.OldJoystick;

public class OldJoystickImpl implements OldJoystick {
    @Override
    public void connectToPort() {
        System.out.println("Conectado via PORT");
    }
    @Override
    public double readInputs() {
        return Math.random();
    }
}
