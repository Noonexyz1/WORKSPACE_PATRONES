package org.example.dominio;

public class OldJoystickToUSBAdapater implements USBJoystick {
    private OldJoystick oldJoystick;
    public OldJoystickToUSBAdapater(OldJoystick oldJoystick) {
        this.oldJoystick = oldJoystick;
    }
    public OldJoystickToUSBAdapater() {

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
