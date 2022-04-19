package T4.A5.E1;

import java.util.*;

public class E1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> rep = new ArrayList<>();
        Set<Integer> listH = new HashSet<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int ran = r.nextInt(10) + 1;
            list.add(ran);
            listH.add(ran);
        }
        System.out.println(list);
        System.out.println(listH);

        for (Integer p :
                list) {
            list.removeAll(listH);
        }


    }
}
