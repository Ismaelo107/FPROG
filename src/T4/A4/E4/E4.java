package T4.A4.E4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        List<Integer> numEnteros = new ArrayList<>();
        List<Integer> otrosEnteros= Arrays.asList(11,12,13);
        Scanner sc = new Scanner(System.in);
        int i = 10;
        System.out.println("Introducir " +i+ " números  : ");
        int num = sc.nextInt();

        while (num != 0) {
            i--;
            System.out.println("Introducir " +i+ " números  : ");
            numEnteros.add(num);
            num = sc.nextInt();
        }

        System.out.println(numEnteros);
        numEnteros.addAll(otrosEnteros);
        System.out.println(numEnteros);
        numEnteros.removeAll(otrosEnteros);
        System.out.println(numEnteros);

    }
}
