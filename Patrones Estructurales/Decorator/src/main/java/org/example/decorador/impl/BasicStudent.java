package org.example.decorador.impl;

import org.example.decorador.port.Aprendible;

//NO TOCAR
public class BasicStudent implements Aprendible {
    @Override
    public void study() {
        System.out.println("Basic student is studying.");
    }
}