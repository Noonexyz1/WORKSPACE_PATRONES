package org.example.basicoMiPractica;

public class EstudianteConMetodos {
    private String id;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private int telefono;

    private String carrera;

    public EstudianteConMetodos(){
    }


    //Mis metodos opcionales para el estudiante
    public void quieroQueCamines(){
        System.out.println("Estoy Caminando...");
    }
    public void quieroQueEstudies(){
        System.out.println("Estoy EStudiando...");

    }
    public void quieroQueDuermas(){
        System.out.println("zZzZzzZZZ...");

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
        private EstudianteConMetodos est;
        private EstudianteBuilder(){
            this.est = new EstudianteConMetodos();
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


        //Mis metodos para agregarlos si se decesa estos metodos del estudiante
        public EstudianteBuilder setQuieroQueCamines(){
            this.est.quieroQueCamines();
            return EstudianteBuilder.this;
        }
        public EstudianteBuilder setQuieroQueEstudies(){
            this.est.quieroQueEstudies();
            return EstudianteBuilder.this;
        }
        public EstudianteBuilder setQuieroQueDuermas(){
            this.est.quieroQueDuermas();
            return EstudianteBuilder.this;
        }


        public EstudianteConMetodos build(){
            return this.est;
        }


    }


}
