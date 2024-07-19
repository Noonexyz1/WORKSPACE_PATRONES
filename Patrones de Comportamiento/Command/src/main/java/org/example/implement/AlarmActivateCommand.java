package org.example.implement;

import org.example.puerto.Command;

public class AlarmActivateCommand implements Command {

    @Override
    public void execute() {
        System.out.println("... Alarma Activando");
    }
}
