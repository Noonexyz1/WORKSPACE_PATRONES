package org.example.port;

public interface State {

    void jugar();
    void alimentar();
    void dormir();
    void comoEstas();

    // Este argumento que es el CONTEXT es para permitir que los estados puedan interactuar
    // con el contexto y cambiar su estado interno. Aunque en algunos métodos
    // del ejemplo no se esté utilizando directamente, el argumento permite que cada
    // estado tenga la capacidad de modificar el estado del Tamagothi si es necesario.
    void setTamagotchi(Tamagotchi tamagotchi);
}
