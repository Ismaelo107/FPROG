package T4.A5.E2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Asignatura> asignaturas = new HashSet<>();

        asignaturas.add(new Asignatura("01", "Lengua", "08:15"));
        asignaturas.add(new Asignatura("02", "Mates", "09:05"));
        asignaturas.add(new Asignatura("03", "Fisica", "10:10"));
        asignaturas.add(new Asignatura("04", "Quimica", "11:00"));
        asignaturas.add(new Asignatura("05", "Tic", "11:30"));

        System.out.println("Codigo       Nombre");
        for (Asignatura asignatura :
                asignaturas) {
            System.out.println("  " + asignatura.getCodigo() + "\t" + "\t" + "\t  " + asignatura.getNombre() + "\n");
        }

        System.out.println("Introducir la asignatura de filosofia");
        System.out.println("Introducir código: ");
        String codigo = sc.next();
        System.out.println("Introducir asignatura: ");
        String nombre = sc.next();
        System.out.println("Introducir hora: ");
        String hora = sc.next();

        asignaturas.add(new Asignatura(codigo, nombre, hora));


        System.out.println("Introducir la asignatura de tecnologia");
        System.out.println("Introducir código: ");
        codigo = sc.next();
        System.out.println("Introducir asignatura: ");
        nombre = sc.next();
        System.out.println("Introducir hora: ");
        hora = sc.next();

        asignaturas.add(new Asignatura(codigo, nombre, hora));

        for (Asignatura asignatura :
                asignaturas) {
            System.out.println(asignatura.toString());
        }


        Iterator<Asignatura> it = asignaturas.iterator();
        Asignatura asignatura;
        while (it.hasNext()) {
            asignatura = it.next();
            if (asignatura.getNombre().equalsIgnoreCase("fisica")){
                it.remove();
            }
        }

        System.out.println("Fisica eliminada");
        for (Asignatura asignatur :
                asignaturas) {
            System.out.println(asignatur.toString());
        }

        List<Asignatura> asigOrdXCo= new ArrayList<>();
        asigOrdXCo.addAll(asignaturas);
        Collections.sort(asigOrdXCo);



        for (Asignatura asignatur :
                asignaturas) {
            System.out.println(asignatur.toString());
        }


    }
}