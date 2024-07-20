package org.example.port;

// Puede tener un metodo o varios metodos segun lo requiera
// Imagina que, en un determinado ESTADO, tal implementacion de estado puede
// hacer estas acciones de esta interfaz
public interface PetState {
    void feed(VirtualPet pet);
    void play(VirtualPet pet);
    void rest(VirtualPet pet);
}
