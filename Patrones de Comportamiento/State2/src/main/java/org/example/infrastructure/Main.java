package org.example.infrastructure;

import org.example.port.Tamagotchi;

public class Main {

    public static void main(String[] args) {
        // Context
        Tamagotchi miTamagotchi = new Tamagotchi();

        // Lanzamos la Interfaz Grafica
        new Menu(miTamagotchi).display();
    }
}
