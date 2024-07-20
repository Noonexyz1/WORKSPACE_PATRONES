package org.example.impl;

import org.example.port.PetState;
import org.example.port.VirtualPet;

public class HungryState implements PetState {

    @Override
    public void feed(VirtualPet pet) {
        System.out.println("The pet is eating...");
        pet.setState(new HappyState());
    }

    @Override
    public void play(VirtualPet pet) {
        System.out.println("The pet is too hungry to play.");
    }

    @Override
    public void rest(VirtualPet pet) {
        System.out.println("The pet is resting but still hungry.");
    }
}
