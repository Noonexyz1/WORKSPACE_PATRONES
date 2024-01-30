package org.example;

import java.util.List;

public class Estudiante {
    //Atributos particulares
    private int idEstudiante;
    private String nombreEstudiante;

    //Atributos de relacion
    List<Curso> cursos;

    //Atributo que debe ser injectado
    Universidad universidad;


    public Estudiante(int idEstudiante, String nombreEstudiante){
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
    }



    //Getters and Setters
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstudiante=" + idEstudiante +
                ", nombreEstudiante='" + nombreEstudiante + '\'' +
                ", cursos=" + cursos +
                ", universidad=" + universidad +
                '}';
    }

}
