package T4.A4.E1;

import T4.A3.E2.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class E1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random r = new Random();


        for (int i = 0; i < 100; i++) {
            int ran = r.nextInt(10) + 1;
            list.add(ran);
        }
        System.out.println(list);

        for (int i = 0; i < 100; i++) {

            list.remove(Integer.valueOf(5));
        }

        System.out.println(list);
    }
}
