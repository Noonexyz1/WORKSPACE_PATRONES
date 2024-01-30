package org.example;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    //Atributos particulares
    private int idUniversidad;
    private String nombre;
    private String ubicacion;

    //Atributos de relacion
    List<Departamento> departamentos;

    //este estudiante debe ser injectado de alguna manera
    List<Estudiante> estudiantes;

    public Universidad(int idUniversidad, String nombre, String ubicacion, List<Estudiante> estudiantes) {
        this.idUniversidad = idUniversidad;
        this.nombre = nombre;
        this.ubicacion = ubicacion;


        //relacion fuerte
        departamentos = new ArrayList<>();

        //esta asociacion solo se inicializa en null (no es COMPOSICION)
        this.estudiantes = estudiantes;

    }

    @Override
    public String toString() {
        return "Universidad{" +
                "idUniversidad=" + idUniversidad +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", departamentos=" + departamentos +
                ", estudiantes=" + estudiantes +
                '}';
    }

    public void nuevoDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    public void nuevoEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void mostrarDepartamentos(){
        departamentos.forEach(d -> System.out.println("Nombre Departamento: " + d.getNombreDep() + "\n" +
                                                      "Ubicacion: " + d.getUbiDep()));
    }

    public void mostrarEstudiantes(){
        estudiantes.forEach(e -> System.out.println("Nombre Estudiante: " + e.getNombreEstudiante() + "\n"));
    }

}
