package org.example.implement;

import org.example.puerto.Command;

public class ThermostatUpCommand implements Command {

    @Override
    public void execute() {
        System.out.println("... Subiendo la Temperatura");
    }
}
