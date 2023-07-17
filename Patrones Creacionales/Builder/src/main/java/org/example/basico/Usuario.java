package org.example.basico;

import java.util.List;

public class Usuario {

    private String id;
    private String nick;
    private String nombre;
    private String nombreFamilia;

    private int edad;
    private int telefono;

    private String profesion;
    private List<String> tags;


    public Usuario(){
    }

    public static Builder builder(String id, String nick, String nombre){
        Builder objBuilder = new Builder(id, nick, nombre);
        return objBuilder;
    }




    public static class Builder{
        private Usuario usuario;
        private Builder(String id, String nick, String nombre){

            this.usuario = new Usuario();

            this.usuario.id = id;
            this.usuario.nick = nick;
            this.usuario.nombre = nombre;
        }



        public Builder nombreFamilia(String nombresFamilia){
            this.usuario.nombreFamilia = nombresFamilia;
            return this;
        }
        public Builder edad(int edad){
            this.usuario.edad = edad;
            return this;
        }
        public Builder telefono(int telefono){
            this.usuario.telefono = telefono;
            return this;
        }
        public Builder profesion(String profesion){
            this.usuario.profesion = profesion;
            return this;
        }
        public Builder addtag(String tag){
            this.usuario.tags.add(tag);
            return this;
        }
        public Usuario build(){
            return this.usuario;
        }

    }


}
