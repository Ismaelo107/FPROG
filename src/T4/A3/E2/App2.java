package T4.A3.E2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        List<Libro> libros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int menu = 0;
        int id;
        String titulo;
        String autor;
        String editorial;


        while (menu != 5) {
            System.out.println("""
                    1- Introducir libro.
                    2.- Imprimir libros introducidos
                    3.- Buscar libro
                    4.- Baja o eliminación (elimina un libro de la lista proporcionándole el id)
                    5.- Salir
                    """);
            System.out.println("Introducir opción a elegir: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Introducir id: ");
                    id = sc.nextInt();
                    System.out.println("Introducir titulo: ");
                    titulo = sc.next();
                    System.out.println("Introducir autor: ");
                    autor = sc.next();
                    System.out.println("Introducir editorial: ");
                    editorial = sc.next();
                    libros.add(new Libro(id, titulo, autor, editorial));
                    break;

                case 2:
                    for (Libro libro : libros) {
                        System.out.println(libro);
                    }
                    break;

                case 3:
                    menu = 0;
                    while (menu != 4) {
                        System.out.println("""
                                1- Por id
                                2- Por titulo
                                3.- Por autor.
                                4- Volver al menú anterior
                                """);
                        System.out.println("Seleccione opcion de búsqueda: ");
                        menu = sc.nextInt();
                        switch (menu) {
                            case 1:
                                Iterator<Libro> it = libros.iterator();
                                Libro libro;
                                System.out.println("Introducir id a buscar: ");
                                id = sc.nextInt();
                                while (it.hasNext()) {
                                    libro = it.next();
                                    if (libro.getId() == id) {
                                        System.out.println("Libro encontrado");
                                        System.out.println(libro);
                                    }
                                }
                                break;

                            case 2:
                                Iterator<Libro> itt = libros.iterator();
                                Libro libro1;
                                System.out.println("Introducir titulo: ");
                                titulo = sc.next();
                                while (itt.hasNext()) {
                                    libro1 = itt.next();
                                    if (libro1.getTitulo().equals(titulo)) {
                                        System.out.println("Libro encontrado");
                                        System.out.println(libro1);
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("Introducir autor: ");
                                autor = sc.next();
                                for (Libro l1 : libros) {
                                    if (l1.getAutor().equals(autor)) {
                                        System.out.println("Libro encontrado");
                                        System.out.println(l1);
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("Volver al menú anterior...");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introducir libro a eliminar: ");
                    id = sc.nextInt();
                    for (Libro l1 : libros) {
                        if (l1.getId() == id) {
                            System.out.println("Libro encontrado");
                            libros.remove(l1);
                            System.out.println("Libro eliminado.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Ciao :)");
                    break;
            }
        }
    }
}



