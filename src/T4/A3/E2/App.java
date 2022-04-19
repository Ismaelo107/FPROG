package T4.A3.E2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Libro> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int menu =0;

        do {
            System.out.println("""
                1- Introducir libro.
                2.- Imprimir libros almacenados
                3.- Buscar libro por id. (realizar tres versiones de este apartado recorriendo con for,
                forecha y con iterator)
                4.- Salir.
                """);
            System.out.println("Seleccionar opción del menu:");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Introducir id:");
                    int id = sc.nextInt();
                    System.out.println("Introducir titulo:");
                    String titulo = sc.next();
                    System.out.println("Introducir autor:");
                    String autor = sc.next();
                    System.out.println("Introducir editorial:");
                    String editorial = sc.next();

                    list.add(new Libro(id, titulo, autor, editorial));

                    break;

                case 2:
                    System.out.println(list);
                    break;

                case 3:
                    System.out.println("Introducir libro a buscar:");
                    id = sc.nextInt();
                    Libro libro;
                    /*Iterator<Libro> it = list.iterator();
                    while (it.hasNext()){
                        libro = it.next();
                        if (libro.getId() == id){
                            System.out.println("Libro encontrado:");
                            for (Libro p :
                                    list) {
                                System.out.println(p);
                            }
                        }else{
                            System.out.println("Libro no encontrado, losiento");
                        }
                    }*/

                    for (Libro p :
                            list) {
                        if (p.getId()==id){
                            System.out.println("Libro encontrado");
                            System.out.println(p);
                        }
                    }

                    break;
                case 4:

                    break;
            }
        }while (menu !=4);

    }
}
