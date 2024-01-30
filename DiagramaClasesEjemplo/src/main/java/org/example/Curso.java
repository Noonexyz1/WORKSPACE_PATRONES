package org.example;

import java.util.List;

public class Curso {
    //Atributos particulares
    private int idCurso;
    private String nombreCurso;
    private int canpacidad;

    //Atributos de relacion
    List<Estudiante> estudiantes;
    Profesor dictaProf;

}
