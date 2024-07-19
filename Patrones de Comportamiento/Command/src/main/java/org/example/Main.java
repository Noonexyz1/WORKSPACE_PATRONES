package org.example;

import org.example.implement.*;
import org.example.puerto.SmartHomeController;

public class Main {

    //codigo cliente o infraestructura
    public static void main(String[] args) {

        SmartHomeController controller = new SmartHomeController(new LightOffCommand());

        controller.setCommand(new LightOnCommand());
        controller.pressButton();

        controller.setCommand(new LightOffCommand());
        controller.pressButton();

        controller.setCommand(new ThermostatUpCommand());
        controller.pressButton();

        controller.setCommand(new ThermostatDownCommand());
        controller.pressButton();

        controller.setCommand(new AlarmActivateCommand());
        controller.pressButton();

        controller.setCommand(new AlarmDisactivateCommand());
        controller.pressButton();
    }
}