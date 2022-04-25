package T8.A1.Anonima;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("67993976J","Ramon","c/Carmona,nº68"));
        alumnos.add(new Alumno("06474576H","Francisco","c/Velazques,nº25"));
        alumnos.add(new Alumno("32545976S","Marina","c/Damian,nº45"));

        System.out.println("Imprimir Alumnos sin ordenar");
        for (Alumno p :
                alumnos) {
            System.out.println(p.toString());
        }

        System.out.println();

        System.out.println("Imprimir Alumnos ordenados");
        alumnos.sort((o1,o2) -> o1.getDni().compareTo(o2.getDni()));
        for (Alumno p :
                alumnos) {
            System.out.println(p.toString());
        }




    }
}
