package org.example.decorador;

import org.example.decorador.interfaces.Aprendible;

public class ChessStudent extends StudentDecorator {

    public ChessStudent(Aprendible student) {
        super(student);
    }

    @Override
    public void study() {
        super.study();
        metodoEspecificoDeChessStudent();
    }

    private void metodoEspecificoDeChessStudent(){
        System.out.println("Chess student also plays chess.");
    }

}

