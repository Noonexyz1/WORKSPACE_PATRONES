package org.example.decorador;

public final class EstudianteImpl {
    private int id;
    private String nombre;


    private String mensaje;


    public EstudianteImpl(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }



    public String getMensaje() {
        return this.mensaje;
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // Otros métodos y atributos...
}
