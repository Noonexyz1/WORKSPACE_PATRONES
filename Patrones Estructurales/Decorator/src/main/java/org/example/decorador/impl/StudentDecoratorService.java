package org.example.decorador.impl;

import org.example.decorador.port.Aprendible;

//Clase Decoradora
public class StudentDecoratorService implements Aprendible {

    //Dependiendo de una abastraccion
    private Aprendible aprendible;

    public StudentDecoratorService(Aprendible aprendible) {
        this.aprendible = aprendible;
    }

    public void setAprendible(Aprendible aprendible){
        this.aprendible = aprendible;
    }


    @Override
    public void study() {
        //Este study() va adoptar la funcionalidad que le haya pasado por el constructor
        this.aprendible.study();
    }
}
