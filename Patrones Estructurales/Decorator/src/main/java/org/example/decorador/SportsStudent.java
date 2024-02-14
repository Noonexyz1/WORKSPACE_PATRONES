package org.example.decorador;

import org.example.decorador.interfaces.Student;

public class SportsStudent extends StudentDecorator {

    public SportsStudent(Student student) {
        super(student);
    }

    @Override
    public void study() {
        super.study();
        System.out.println("Sports student also participates in sports activities.");
    }

}

