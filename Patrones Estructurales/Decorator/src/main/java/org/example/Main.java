package org.example;

import org.example.decorador.BasicStudent;
import org.example.decorador.ChessStudent;
import org.example.decorador.SportsStudent;
import org.example.decorador.interfaces.Student;

public class Main {
    public static void main(String[] args) {
        Student basicStudent = new BasicStudent();
        basicStudent.study(); // Salida: "Basic student is studying."

        basicStudent = new ChessStudent(basicStudent);
        basicStudent.study(); // Salida: "Basic student is studying. Chess student also plays chess."


        basicStudent = new SportsStudent(basicStudent);
        basicStudent.study();


    }

}