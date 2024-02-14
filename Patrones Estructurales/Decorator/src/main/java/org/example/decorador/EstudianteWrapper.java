package org.example.decorador;

public class EstudianteWrapper{
    private EstudianteImpl estudiante;

    public EstudianteWrapper(EstudianteImpl estudiante) {
        this.estudiante = estudiante;
    }


    public EstudianteImpl getEstudiante() {
        return estudiante;
    }


}
