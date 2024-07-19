package org.example.implement;

import org.example.puerto.Command;

public class LightOffCommand implements Command {

    @Override
    public void execute() {
        System.out.println("... Luces Apagando");
    }
}
