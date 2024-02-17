package org.example.decorador;

import org.example.decorador.interfaces.Aprendible;

public abstract class StudentDecorator implements Aprendible {

    private final Aprendible aprendible;

    public StudentDecorator(Aprendible aprendible) {
        this.aprendible = aprendible;
    }

    @Override
    public void study() {
        //Este study() va adoptar la funcionalidad que le haya pasado por el constructor
        this.aprendible.study();
    }

}

