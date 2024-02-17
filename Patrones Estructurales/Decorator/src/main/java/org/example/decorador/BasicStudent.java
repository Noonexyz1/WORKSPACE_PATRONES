package org.example.decorador;

import org.example.decorador.interfaces.Aprendible;

//NO TOCAR
public class BasicStudent implements Aprendible {
    @Override
    public void study() {
        System.out.println("Basic student is studying.");
    }
}