package org.example.basicoMiPractica;

public class EstudianteFuncional {

    private String id;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private int telefono;
    private String carrera;


    private IEstudianteCaminar caminar;
    private IEstudianteDormir dormir;
    private IEstudianteEstudiar estudiar;



    public EstudianteFuncional(){
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
    public IEstudianteCaminar getCaminar() {
        return caminar;
    }
    public IEstudianteDormir getDormir() {
        return dormir;
    }
    public IEstudianteEstudiar getEstudiar() {
        return estudiar;
    }





    public static Builder builder(){
        Builder builder = new Builder();
        return builder;
    }





    public static class Builder{
        private EstudianteFuncional est;
        private Builder(){
            this.est = new EstudianteFuncional();
        }



        public Builder setId(String id){
            this.est.id = id;
            return Builder.this;
        }
        public Builder setNombre(String nombre){
            this.est.nombre = nombre;
            return Builder.this;
        }
        public Builder setApellido(String apellido){
            this.est.apellido = apellido;
            return Builder.this;
        }
        public Builder setGenero(String genero){
            this.est.genero = genero;
            return Builder.this;
        }
        public Builder setDireccion(String direccion){
            this.est.direccion = direccion;
            return Builder.this;
        }
        public Builder setTelefono(int telefono){
            this.est.telefono = telefono;
            return Builder.this;
        }
        public Builder setCarrera(String carrera){
            this.est.carrera = carrera;
            return Builder.this;
        }



        //Aqui viene la parte funcional
        public Builder setCaminarMetod(IEstudianteCaminar caminar){
            this.est.caminar = caminar;
            return Builder.this;
        }
        public Builder setDormirMetod(IEstudianteDormir dormir){
            this.est.dormir = dormir;
            return Builder.this;
        }
        public Builder setEstudiarMetod(IEstudianteEstudiar estudiar){
            this.est.estudiar = estudiar;
            return Builder.this;
        }



        public EstudianteFuncional build(){
            return this.est;
        }



    }





}
