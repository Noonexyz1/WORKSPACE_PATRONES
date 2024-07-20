package org.example;

import org.example.impl.HappyState;
import org.example.impl.HungryState;
import org.example.impl.TiredState;
import org.example.port.VirtualPet;

public class Main {

    // Codigo Cliente o InfraEstructura
    public static void main(String[] args) {
        // Estado inicial: Feliz constructor(new HappyState())
        VirtualPet pet = new VirtualPet();

        //pet.setState(new HungryState());
        //pet.setState(new HappyState());
        pet.setState(new TiredState());


        pet.play();
        pet.feed();

        // Mascota se cansa
        pet.rest();

        // Mascota vuelve a estar feliz
        pet.feed();

        // Mascota se cansa otra vez
        pet.play();

        // Mascota descansa
        pet.rest();

        // Alimentar cuando está feliz
        pet.feed();


    }
}