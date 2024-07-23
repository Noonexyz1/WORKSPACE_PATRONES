package org.example.decorador;

import org.example.decorador.impl.StudentDecoratorService;
import org.example.decorador.port.Aprendible;

public class ChessStudent extends StudentDecoratorService {

    public ChessStudent(Aprendible student) {
        super(student);
    }


    //Sobrescribimos para ejecutar la accion del padre
    @Override
    public void study() {
        super.study();

        //Los metodo se ejecutan depues de la llamada al padre
        metodoEspecificoDeChessStudent();
    }

    private void metodoEspecificoDeChessStudent(){
        System.out.println("Chess student also plays chess.");
    }
}

