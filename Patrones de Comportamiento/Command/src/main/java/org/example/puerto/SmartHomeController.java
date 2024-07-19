package org.example.puerto;

//Clase invocadora
public class SmartHomeController {
    private Command command;

    public SmartHomeController(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    //metodo para ejecutar la accion
    public void pressButton(){
        command.execute();
    }
}
