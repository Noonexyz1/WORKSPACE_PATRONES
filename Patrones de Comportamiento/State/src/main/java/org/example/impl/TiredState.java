package org.example.impl;

import org.example.port.PetState;
import org.example.port.VirtualPet;

public class TiredState implements PetState {

    @Override
    public void feed(VirtualPet pet) {
        System.out.println("The pet is too tired to eat.");
    }

    @Override
    public void play(VirtualPet pet) {
        System.out.println("The pet is too tired to play.");
    }

    @Override
    public void rest(VirtualPet pet) {
        System.out.println("The pet tired so resting...");
        pet.setState(new HappyState());
    }
}
