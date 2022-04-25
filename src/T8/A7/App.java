package T8.A7;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Alumno> alumnos= new ArrayList<>();
        alumnos.add(new Alumno("80000111","Lopez Perez, Esther", "Avda de Extremadura s/n"));
        alumnos.add(new Alumno("80000222","Garcia Ramirez, Antonio", "Avda de Extremadura s/n"));
        alumnos.add(new Alumno("80000444","Alvarez Ortiz, Arturo", "Avda de Extremadura s/n"));
        alumnos.add(new Alumno("80000000","Gomez Sanchez, Lucia", "Avda de Extremadura s/n"));
        alumnos.add(new Alumno("80000000","Gomez Leon, Lucia", "Avda de Extremadura s/n"));

        //a) Imprime los elementos de la colección ordenados por nombre utilizando un stream.


        //b) Filtra los usuarios llamados Antonio e imprimelos por pantalla.
        //c) Almacena los usuarios filtrados anteriormente en un nuevo array.
    }
}
