package org.example.implement;

import org.example.puerto.Command;

public class AlarmDisactivateCommand implements Command {

    @Override
    public void execute() {
        System.out.println("... Alarma Desactivando");
    }
}
