package org.example.implement;

import org.example.puerto.Command;

public class LightOnCommand implements Command {

    @Override
    public void execute() {
        System.out.println("... Luces Encendidiendo");
    }
}
