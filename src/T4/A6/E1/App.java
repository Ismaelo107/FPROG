package T4.A6.E1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Socio> socios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        String dni;
        String nombre;
        LocalDate fecha;

        socios.add(new Socio("57763454N", "Andrés", LocalDate.of(2000, 2, 10)));
        socios.add(new Socio("01964044M", "Gerard", LocalDate.of(1990, 8, 8)));
        socios.add(new Socio("50902256J", "Eva", LocalDate.of(2006, 10, 19)));


        while (menu != 6) {
            System.out.println("""
                    1- Alta de socio.
                    2.- Baja socio.
                    3.- Modificación de socio.
                    4.- Listado por DNI.
                    5.- Listado por antigüedad.
                    6.- Salir
                    """);
            System.out.println("Introducir opción a elegir: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Introducir DNI");
                    dni = sc.next();
                    System.out.println("Introducir Nombre");
                    nombre = sc.next();
                    System.out.println("Introducir Fecha Antigüedad");
                    fecha = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    socios.add(new Socio(dni, nombre, fecha));
                    break;
                case 2:
                    System.out.println("Introducir DNI de socio a buscar: ");
                    dni = sc.next();
                    Iterator<Socio> it = socios.iterator();
                    Socio socio;
                    while (it.hasNext()) {
                        socio = it.next();
                        if (socio.getDni().equals(dni)) {
                            it.remove();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introducir DNI de socio a modificar: ");
                    dni = sc.next();
                    Iterator<Socio> itm = socios.iterator();
                    Socio socio1;
                    while (itm.hasNext()) {
                        socio1 = itm.next();
                        if (socio1.getDni().equals(dni)) {
                            System.out.println("Introducir nuevo DNI: ");
                            socio1.setDni(sc.next());
                            System.out.println("Introducir nuevo Nombre: ");
                            socio1.setNombre(sc.next());
                            System.out.println("Introducir nueva Fecha: ");
                            socio1.setFechaAlta(LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                        }
                    }
                    break;
                case 4:
                    List<Socio> ordXDni = new ArrayList<>(socios);
                    Collections.sort(ordXDni);
                    for (Socio p :
                            ordXDni) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    socios.sort(new OXAntiguedad());

                    for (Socio p :
                            socios) {
                        System.out.println(p);
                    }
                    break;
                case 6:
                    System.out.println("Adios");
                    break;

            }
        }

    }
}
