package Examen2.Ejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Coche> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String matricula;
        String modelo;
        Float pvp;
        String fechaVenta;
        int menu = 0;
        System.out.println("""
                1) Alta de un coche
                2) Modificar un coche (matricula)
                3) Buscar coche por modelo
                4) Listado ordenado por modelo
                5) Eliminacion dada la matricula
                6) Salir
                """);
        System.out.println("Eliga Opcion");

        while (menu != 6) {
            System.out.println("""
                    1) Alta de un coche
                    2) Modificar un coche (matricula)
                    3) Buscar coche por modelo
                    4) Listado ordenado por modelo
                    5) Eliminacion dada la matricula
                    6) Salir
                    """);
            System.out.println("Eliga Opcion");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Introducir matricula");
                    matricula = sc.next();
                    System.out.println("Introducir modelo");
                    modelo = sc.next();
                    System.out.println("Introducir precio venta");
                    pvp = sc.nextFloat();
                    System.out.println("Introducir fecha de venta");
                    fechaVenta = sc.next();
                    coches.add(new Coche(matricula, modelo, pvp, fechaVenta));
                    System.out.println("Alta correcta");
                    for (Coche p : coches) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.println("Introducir matrícula de coche a modificar: ");
                    matricula = sc.next();
                    Coche coche;
                    Iterator<Coche> it = coches.iterator();
                    while (it.hasNext()) {
                        coche = it.next();
                        if (coche.getMatricula().equalsIgnoreCase(matricula)) {
                            System.out.println("El coche con matricula"+coche.getMatricula());
                            System.out.println("Introducir matricula");
                            matricula = sc.next();
                            coche.setMatricula(matricula);
                            System.out.println("Introducir modelo");
                            modelo = sc.next();
                            coche.setModelo(modelo);
                            System.out.println("Introducir precio venta");
                            pvp = sc.nextFloat();
                            coche.setPvp(pvp);
                            System.out.println("Introducir fecha de venta");
                            fechaVenta = sc.next();
                            coche.setFechaVenta(fechaVenta);

                        }
                    }
                    System.out.println("La matricula ha sido cambiada a");
                    break;

            }
        }


    }
}
