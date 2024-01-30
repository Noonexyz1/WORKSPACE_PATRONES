package org.example;

import java.util.List;

public class Ensenanza {
    private int idEnsenancia;
    private int horasEnsenancia;
    private String fechaEnsenancia;

    private List<Curso> cursos;
    private List<Profesor> profesors;


    public Ensenanza(int idEnsenancia, int horasEnsenancia, String fechaEnsenancia, List<Curso> cursos, List<Profesor> profesors) {
        this.idEnsenancia = idEnsenancia;
        this.horasEnsenancia = horasEnsenancia;
        this.fechaEnsenancia = fechaEnsenancia;

        this.cursos = cursos;
        this.profesors = profesors;
    }




}
