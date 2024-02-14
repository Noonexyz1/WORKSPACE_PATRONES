package org.example.decorador;

import org.example.decorador.interfaces.Student;

public class ChessStudent extends StudentDecorator {
    public ChessStudent(Student student) {
        super(student);
    }

    @Override
    public void study() {
        super.study();
        System.out.println("Chess student also plays chess.");
    }
}

