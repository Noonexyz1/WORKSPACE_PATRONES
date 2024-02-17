package org.example.decorador;

import org.example.decorador.interfaces.Aprendible;

public class SportsStudent extends StudentDecorator {

    public SportsStudent(Aprendible student) {
        super(student);
    }

    @Override
    public void study() {
        super.study();
        mostrarMensajeSportStudent();
    }

    private void mostrarMensajeSportStudent(){
        System.out.println("Sports student also participates in sports activities.");
    }

}

