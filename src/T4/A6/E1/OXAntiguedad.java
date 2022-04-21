package T4.A6.E1;

import java.util.Comparator;

public class OXAntiguedad implements Comparator<Socio> {
    @Override
    public int compare(Socio o1,Socio o2){
        return o1.getFechaAlta().compareTo(o2.getFechaAlta());
    }
}
