package T4.A3.E1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir número: ");
        int num = sc.nextInt();

        // Mostrar número
        while (num != -1) {
            list.add(num);
            System.out.println("Introducir número: ");
            num = sc.nextInt();
        }
        System.out.println("Mostrando número:");
        System.out.println(list);

        // Mostrar número pares
        System.out.println("Mostrando número pares:");
        for (Integer p :
                list) {
            if (p % 2 == 0) {
                System.out.print(p);
            }
        }


        // Eliminando múltiplos de 3

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 3 == 0) {
                it.remove();
            }
        }
        System.out.println();
        System.out.println("Eliminando multiplos de 3:");
        for (Integer p :
                list) {
            System.out.print(p);
        }
    }
}
