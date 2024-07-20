package org.example.impl;

import org.example.port.PetState;
import org.example.port.VirtualPet;

public class HappyState implements PetState {

    @Override
    public void feed(VirtualPet pet) {
        System.out.println("The pet is happy and eats a little.");
    }

    @Override
    public void play(VirtualPet pet) {
        System.out.println("The pet is playing happily!");
        pet.setState(new TiredState());
    }

    @Override
    public void rest(VirtualPet pet) {
        System.out.println("The pet is resting happily.");
    }
}
