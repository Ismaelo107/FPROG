package T4.A4.E2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class E2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random r = new Random();


        for (int i = 0; i < 100; i++) {
            int ran = r.nextInt(10) + 1;
            list.add(ran);
        }
        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() == 5){
                it.remove();
            }
        }

        System.out.println(list);
    }
}
