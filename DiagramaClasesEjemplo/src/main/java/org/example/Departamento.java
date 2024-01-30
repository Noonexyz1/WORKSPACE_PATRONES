package org.example;

import java.util.List;

public class Departamento {
    //Atributos particulares
    private int idDepartamento;
    private String nombreDep;
    private String ubiDep;

    //Atributos de relacion
    private List<Profesor> profesores;


    public  Departamento(){
        //por defecto al crear una universidad
        idDepartamento = 1;
        nombreDep = "Economia";
        ubiDep = "Zona Milagros";
    }

    public Departamento(int idDepartamento, String nombreDep, String ubiDep, List<Profesor> profesores){
        this.idDepartamento = idDepartamento;
        this.nombreDep = nombreDep;
        this.ubiDep = ubiDep;

        this.profesores = profesores;

    }

    //Getterd and Setters
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public String getUbiDep() {
        return ubiDep;
    }

    public void setUbiDep(String ubiDep) {
        this.ubiDep = ubiDep;
    }
}
