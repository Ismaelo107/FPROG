package T4.A4.E3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        List<Integer> fusion = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir número del 1-10");
        int num = sc.nextInt();

        while (num != 0) {
            System.out.println("Introducir número del 1-10");
            list.add(num);
            num = sc.nextInt();
        }
        for (Integer p :
                list) {
            if (p % 2 == 0) {
                pares.add(p);
            } else {
                impares.add(p);
            }
        }

        fusion.addAll(pares);
        fusion.addAll(impares);

        System.out.println(list);
        System.out.println(pares);
        System.out.println(impares);
        System.out.println(fusion);



    }
}
