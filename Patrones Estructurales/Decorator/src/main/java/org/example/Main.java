package org.example;

import org.example.decorador.EstudianteImpl;
import org.example.decorador.EstudianteWrapper;

public class Main {
    public static void main(String[] args) {

        EstudianteImpl est1 = new EstudianteImpl(100, "Pitter Parker");
        est1.setMensaje("Estoy estudiando");
        System.out.println(est1.getMensaje());

        EstudianteWrapper est1Pod = new EstudianteWrapper(est1);
        System.out.println(est1Pod.getEstudiante().getMensaje());

        est1Pod.getEstudiante().setMensaje("Estoy estudiando con poderes de trepar");
        System.out.println(est1.getMensaje());

        System.out.println(est1Pod.getEstudiante().getMensaje());

    }

}