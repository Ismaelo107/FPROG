package T8.A1.E1.Lambda;


import java.util.ArrayList;
import java.util.Comparator;
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
        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getDni().compareTo(o2.getDni());
            }
        });
        for (Alumno p :
                alumnos) {
            System.out.println(p.toString());
        }




    }
}
