package org.example;

import org.example.basico.Usuario;
import org.example.basicoMiPractica.Estudiante;
import org.example.basicoMiPractica.EstudianteConMetodos;
import org.example.basicoMiPractica.EstudianteFuncional;

public class Main {

    public static void builderSimple(){
        Usuario usuario = Usuario.builder("id", "nick", "mi Nombre")
                .telefono(234234)
                .edad(56)
                .build();


        //de manera tradicional
        Estudiante est = new Estudiante();
        System.out.println(est.getApellido());

        //de manera Builder
        Estudiante est2 = Estudiante.builder()
                .setNombre("Juan")
                .setNombre("Diego")
                .setApellido("MAmani")
                .setCarrera("Ing Sistemas")
                .setId("10")
                .setGenero("HOMBRE")
                .setDireccion("La Lomas")
                .setTelefono(1233454)
                .build();

        System.out.println(est2.getNombre() + " : " + est2.getId());

        //Sobreescribe la referencia
        est2 = Estudiante.builder().setNombre("Diego Diomir").build();
        System.out.println(est2.getNombre() + " : " + est2.getId());



        //Lo mismo pero construyendo con funciones
        EstudianteConMetodos est3 = EstudianteConMetodos.builder()
                .setNombre("Juan")
                .setNombre("Diego")
                .setApellido("MAmani")
                .setCarrera("Ing Sistemas")
                .setId("10")
                .setGenero("HOMBRE")
                .setDireccion("La Lomas")
                .setTelefono(1233454)

                //Aññadiendo funciones
                .setQuieroQueCamines()
                .setQuieroQueEstudies()
                .setQuieroQueDuermas()
                .build(); //No es lo que yo pensaba, al momento de instanciarlo,
                        //inmediatamente efecuta las funciones que le estableci al momento de construirlo



        //Lo mismo pero esta vez con programacion funcional
        EstudianteFuncional est4 = EstudianteFuncional.builder()
                .setNombre("Juan")
                .setNombre("Diego")
                .setApellido("MAmani")
                .setCarrera("Ing Sistemas")
                .setId("10")
                .setGenero("HOMBRE")
                .setDireccion("La Lomas")
                .setTelefono(1233454)

                //parte funcnional
                .setCaminarMetod(() -> System.out.println("Estoy Caminando..."))
                .setEstudiarMetod(() -> System.out.println("Estoy Estudiando..."))
                .setDormirMetod(() -> System.out.println("zzZzZZzZZZZ..."))
                .build();

        System.out.println(est4.getNombre() + " : " + est4.getId());
        est4.getCaminar().estudianteCamina();
        est4.getEstudiar().estudianteEstudia();
        est4.getDormir().estudianteDuerme();
        // =) LO QUE YO ESPERABA

    }
    public static void builderAvanzado(){
        
    }


    public static void main(String[] args) {
        builderSimple();
        //builderAvanzado();
    }
}