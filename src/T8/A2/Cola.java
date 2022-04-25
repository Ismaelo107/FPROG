package T8.A2;

import java.util.ArrayList;
import java.util.List;

public class Cola {

        List<Integer> list = new ArrayList<>();

        public Cola(){}

        public void encolar (Integer n){
            list.add(n);
        }

        public Integer desencolar(){
            Integer n;
            if (list.size()>0){
                n = this.list.get(0);
                this.list.remove(0);
                return n;
            } else {
                return null;
            }

        }
}
