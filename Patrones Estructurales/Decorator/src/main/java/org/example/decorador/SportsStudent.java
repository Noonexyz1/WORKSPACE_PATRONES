package org.example.decorador;

import org.example.decorador.impl.StudentDecoratorService;
import org.example.decorador.port.Aprendible;

public class SportsStudent extends StudentDecoratorService {

    public SportsStudent(Aprendible student) {
        super(student);
    }


    //Sobrescribimos para ejecutar la accion del padre
    @Override
    public void study() {
        super.study();

        //Los metodo se ejecutan depues de la llamada al padre
        mostrarMensajeSportStudent();
    }

    private void mostrarMensajeSportStudent(){
        System.out.println("Sports student also participates in sports activities.");
    }
}

