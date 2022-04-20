package T4.A5.E2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

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
        String codigo = "06";
        System.out.println("Introducir asignatura: ");
        String nombre = "Filosofia";
        System.out.println("Introducir hora: ");
        String hora ="18:30";

        asignaturas.add(new Asignatura(codigo, nombre, hora));


        System.out.println("Introducir la asignatura de tecnologia");
        System.out.println("Introducir código: ");
        codigo = "07";
        System.out.println("Introducir asignatura: ");
        nombre = "Tecnologia";
        System.out.println("Introducir hora: ");
        hora = "16:45";

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

        System.out.println("Implimiendo ordenado por código");

        List<Asignatura> sorXCod = new ArrayList<>();
        sorXCod.addAll(asignaturas);
        Collections.sort(sorXCod);

        System.out.println("Descendente");
        for (Asignatura p :
                sorXCod) {
            System.out.println(p.toString());
        }

        //System.out.println("Ascendente");
        //for (int i = sorXCod.size()-1; i > 0 ; i--) {
        //    System.out.println(sorXCod.get(i).toString());
        //}

        // Aun no explicar
        System.out.println("Utilizando Collecions para ordenar");
        // opcion1 de ordenacion
        /*Comparator<Asignatura> comparador = Collections.reverseOrder();
        Collections.sort(sorXCod,comparador);
        */
        // opcion 2 de ordenacion
        //Collections.sort(sorXCod,Collections.reverseOrder());

        //opcion 3 de ordenacion
        sorXCod.sort(Collections.reverseOrder());
        for (Asignatura p :
                sorXCod) {
            System.out.println(p.toString());
        }

        System.out.println("Ordenar por Nombre");
        sorXCod.sort(new OrdenarXNombre());
        for (Asignatura p :
                sorXCod) {
            System.out.println(p.toString());
        }

    }
}