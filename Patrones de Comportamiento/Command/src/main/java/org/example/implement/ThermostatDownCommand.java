package org.example.implement;

import org.example.puerto.Command;

public class ThermostatDownCommand implements Command {

    @Override
    public void execute() {
        System.out.println("... Bajando la Termperatura");
    }
}
