package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------Simulacion de estudiantes------------");
        Estudiante estudiante1 = new Estudiante(1, "Jose");
        Estudiante estudiante2 = new Estudiante(2, "Ana");
        Estudiante estudiante3 = new Estudiante(3, "Carlos");
        Estudiante estudiante4 = new Estudiante(4, "Tania");

        System.out.println(estudiante1.toString());




        System.out.println("------------Simulacion de una universidad------------");
        Universidad universidad1 = new Universidad(100, "San Marcos", "Zona Los Castigos", new ArrayList<Estudiante>());
        //mostramos el departamento creado por defecto
        universidad1.mostrarDepartamentos();


        //esta universidad debe ser capaz de agregar nuevos departamentos
        universidad1.nuevoDepartamento(new Departamento(2, "Derecho", "Zona Milagros", new ArrayList<Profesor>()));

        //mostramos si es capaz de mostrar el departamento creado
        System.out.println("------------nuevos departamentos------------");
        universidad1.mostrarDepartamentos();


        System.out.println("------------nuevos departamentos------------");
        //la universidad debe ser capaz de añadir estudiantes
        universidad1.nuevoEstudiante(estudiante2);
        universidad1.nuevoEstudiante(estudiante3);
        universidad1.nuevoEstudiante(estudiante4);
        System.out.println("------------Estudiantes añadidos a la U------------");
        //mostramos los nuevos estudiantes simulados
        universidad1.mostrarEstudiantes();


        //como sabemos que estudiante ya va a una universida si tan solo lo añadimos sin que el lo sepa?





    }
}