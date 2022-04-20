package T4.A5.E2;

import java.util.Comparator;

public class OrdenarXNombre implements Comparator<Asignatura> {

    @Override
    public int compare(Asignatura o1, Asignatura o2){
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
