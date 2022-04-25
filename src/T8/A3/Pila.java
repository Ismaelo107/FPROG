package T8.A3;

import java.util.ArrayList;
import java.util.List;

public class Pila {

        List<Integer> list = new ArrayList<>();

        public Pila(){}

        public void push(Integer n){
            list.add(n);
        }

        public Integer pop(){
            Integer n;
            if (list.size()>0){
                n = this.list.get(this.list.size()-1);
                this.list.remove(this.list.size()-1);
                return n;
            } else {
                return null;
            }

        }
}
