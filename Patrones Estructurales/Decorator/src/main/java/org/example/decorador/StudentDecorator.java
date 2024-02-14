package org.example.decorador;

import org.example.decorador.interfaces.Student;

public abstract class StudentDecorator implements Student {
    private final Student student;

    public StudentDecorator(Student student) {
        this.student = student;
    }

    @Override
    public void study() {
        this.student.study();
    }

}

