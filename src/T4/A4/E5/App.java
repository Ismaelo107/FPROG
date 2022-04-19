package T4.A4.E5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();
        int menu = 0;
        String nombre;

        alumnos.add(new Alumno("37520445J", "Juan Pedro", "Nieves Santos", "c\\egido,26"));
        alumnos.add(new Alumno("78920434U", "Pedro", "Flores", "c\\aro,26"));
        alumnos.add(new Alumno("45657435D", "Juana", "Cortes ", "c\\españa,26"));
        alumnos.add(new Alumno("76596457H", "Juan", "Moreno", "c\\castuo,26"));
        alumnos.add(new Alumno("34535436K", "Daniel", " Santos", "c\\rupertoanudez,26"));


        while (menu != 6) {
            System.out.println("""
                    1.- Buscar alumno por nombre. 
                    2.- Busca los alumnos que empiecen por parte del nombre introducido por teclado.
                    3.- Extraer el primer apellido del alumno cuyo nombre se proporcione por teclado.
                    4.- Obtener tamaño de los apellidos. Para un nombre dado buscar en el arrayList
                    si existe y dar el tamaño de los apellidos.
                    5.- Remplazar nombres. Reemplaza todos los nombre que aparezcan como Jordi
                    por Jorge.
                    6.- Salir
                    """);
            System.out.println();
            System.out.println("Elegir la opcion a seleccionar: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Introducir nombre: ");
                    nombre = sc.next();
                    Iterator<Alumno> it = alumnos.iterator();
                    Alumno alumno;
                    while (it.hasNext()) {
                        alumno = it.next();
                        if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Alumno encontrado");
                            System.out.println(alumno);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introducir iniciales: ");
                    nombre = sc.next();
                    Iterator<Alumno> it1 = alumnos.iterator();
                    Alumno alumno1;
                    while (it1.hasNext()) {
                        alumno1 = it1.next();
                        if (alumno1.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                            System.out.println("Alumno encontrado");
                            System.out.println(alumno1);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introducir nombre: ");
                    nombre = sc.next();
                    Iterator<Alumno> it2 = alumnos.iterator();
                    Alumno alumno2;
                    while (it2.hasNext()) {
                        alumno2 = it2.next();
                        if (alumno2.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Alumno encontrado");
                            System.out.println(alumno2.getApellidos());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introducir nombre: ");
                    nombre = sc.next();
                    Iterator<Alumno> it3 = alumnos.iterator();
                    Alumno alumno3;
                    while (it3.hasNext()) {
                        alumno3 = it3.next();
                        if (alumno3.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Alumno encontrado");
                            System.out.println(alumno3.getApellidos().length());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Introducir nombre: ");
                    nombre = sc.next();
                    Iterator<Alumno> it4 = alumnos.iterator();
                    Alumno alumno4;
                    while (it4.hasNext()) {
                        alumno4 = it4.next();
                        if (alumno4.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Alumno encontrado");
                            System.out.println(alumno4);
                            System.out.println("Introducir nombre a remplazar");
                            alumno4.setNombre(sc.next());
                            System.out.println("Alumno remplazado...");
                            System.out.println(alumno4);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Adiós");
                    break;


            }

        }
    }
}
