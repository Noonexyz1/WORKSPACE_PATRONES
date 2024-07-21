package org.example;

import org.example.dominio.impl.ConsolaImpl;
import org.example.dominio.impl.OldJoystickToUSBAdapater;
import org.example.dominio.impl.USBJoystickImpl;
import org.example.dominio.incompatible.OldJoystickImpl;
import org.example.dominio.port.Consola;
import org.example.dominio.port.OldJoystick;
import org.example.dominio.port.USBJoystick;

public class Main {

    public static void main(String[] args) {

        //Creando Instancias de mis DOS Joysticks
        OldJoystick oldJoystick = new OldJoystickImpl();
        oldJoystick.connectToPort();
        System.out.println(oldJoystick.readInputs());

        USBJoystick usbJoystick = new USBJoystickImpl();
        usbJoystick.connectToUSB();
        System.out.println(usbJoystick.readData());
        //Este es el lado Cliente, las instancias de interfaces me estan dando la API (servicio) para mi.
        //Osea que desde esta clase Main o metodo, estoy consumiendo su servicio de cada implementacion de interfaz

        System.out.println();

        //Voy a crear una relacion entre Joystic y Consola para conectar,
        //Entonces tengo una consola donde una clase Consola puede tener un Joystick
        //Y un Joystick puede conectarse a varias Consolas
        Consola consola = new ConsolaImpl();
        consola.conectarUSBJoystick(usbJoystick);
        consola.leerDatosDeUSBJoystick();

        //Pero que sucede si quiero conectar mi OldJoystick?????
        //Hacemos un adapter con la interfaz que necesitemos
        consola.conectarUSBJoystick(new OldJoystickToUSBAdapater(oldJoystick));
        consola.leerDatosDeUSBJoystick();

    }

}