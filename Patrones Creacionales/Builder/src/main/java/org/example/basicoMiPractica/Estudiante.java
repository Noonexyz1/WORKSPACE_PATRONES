package org.example.basicoMiPractica;

public class Estudiante {
    private String id;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private int telefono;

    private String carrera;

    public Estudiante(){
    }


    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getGenero() {
        return genero;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getCarrera() {
        return carrera;
    }



    public static EstudianteBuilder builder(){
        EstudianteBuilder estBuild = new EstudianteBuilder();
        return estBuild;
    }


    public static class EstudianteBuilder {
        private Estudiante est;
        private EstudianteBuilder(){
            this.est = new Estudiante();
        }


        public EstudianteBuilder setId(String id){
            this.est.id = id;
            return EstudianteBuilder.this;
        }
        public EstudianteBuilder setNombre(String nombre){
            this.est.nombre = nombre;
            return EstudianteBuilder.this;
        }
        public EstudianteBuilder setApellido(String apellido){
            this.est.apellido = apellido;
            return EstudianteBuilder.this;
        }
        public EstudianteBuilder setGenero(String genero){
            this.est.genero = genero;
            return EstudianteBuilder.this;
        }
        public EstudianteBuilder setDireccion(String direccion){
            this.est.direccion = direccion;
            return EstudianteBuilder.this;
        }
        public EstudianteBuilder setTelefono(int telefono){
            this.est.telefono = telefono;
            return EstudianteBuilder.this;
        }
        public EstudianteBuilder setCarrera(String carrera){
            this.est.carrera = carrera;
            return EstudianteBuilder.this;
        }


        public Estudiante build(){
            return this.est;
        }


    }





}
