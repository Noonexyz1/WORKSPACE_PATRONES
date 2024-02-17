package org.example;

import org.example.decorador.BasicStudent;
import org.example.decorador.ChessStudent;
import org.example.decorador.SportsStudent;
import org.example.decorador.interfaces.Aprendible;

public class Main {
    public static void main(String[] args) {

        //creo una instancia comun y corriente
        Aprendible basicStudent = new BasicStudent();
        basicStudent.study(); // Salida: "Basic student is studying."


        /*PROBLEMA, ME PIDEN AGREGAR NUEVAS FUNCIONES COMO ADICION, JUGAR TAMBIEN AJEDRES Y DEPORTES*/
        basicStudent = new ChessStudent(basicStudent);
        basicStudent.study(); // Salida: "Basic student is studying. Chess student also plays chess."


        basicStudent = new SportsStudent(basicStudent);
        basicStudent.study(); // Salida: "Basic student is studying. Sports student also plays sports."


    }

}