package org.example;

import org.example.decorador.impl.BasicStudent;
import org.example.decorador.ChessStudent;
import org.example.decorador.SportsStudent;
import org.example.decorador.port.Aprendible;

public class Main {

    public static void main(String[] args) {

        //Creo una instancia comun y corriente
        Aprendible basicStudent = new BasicStudent();
        basicStudent.study(); // Salida: "Basic student is studying."


        //PROBLEMA, ME PIDEN AGREGAR NUEVAS FUNCIONES COMO ADICION, JUGAR TAMBIEN AJEDRES Y DEPORTES
        basicStudent = new ChessStudent(basicStudent);
        basicStudent.study(); // Salida: "Basic student is studying. Chess student also plays chess."

        // Como SportsStudent no implementa la interfaz Aprendible, pero si hereda de una otra clase
        // que si lo implementa, entonces el hijo lo implementa de manera implicita y es compatible
        // la instancia a continuacion, y la soporta.
        basicStudent = new SportsStudent(basicStudent);
        basicStudent.study(); // Salida: "Basic student is studying. Sports student also plays sports."
    }
}