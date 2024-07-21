package org.example.dominio.impl;

import org.example.dominio.port.OldJoystick;
import org.example.dominio.port.USBJoystick;

public class OldJoystickToUSBAdapater implements USBJoystick {

    private OldJoystick oldJoystick;

    public OldJoystickToUSBAdapater(OldJoystick oldJoystick) {
        this.oldJoystick = oldJoystick;
    }


    @Override
    public void connectToUSB() {
        oldJoystick.connectToPort();
    }

    @Override
    public double readData() {
        return oldJoystick.readInputs();
    }
}
