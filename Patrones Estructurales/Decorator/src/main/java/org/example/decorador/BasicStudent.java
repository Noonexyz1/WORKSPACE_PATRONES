package org.example.decorador;

import org.example.decorador.interfaces.Student;

public class BasicStudent implements Student {
    @Override
    public void study() {
        System.out.println("Basic student is studying.");
    }
}
