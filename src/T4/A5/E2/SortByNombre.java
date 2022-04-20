package T4.A5.E2;

import java.util.Comparator;

public class SortByNombre implements Comparator<Asignatura> {

        @Override
        public int compare(Asignatura a1, Asignatura a2) {
            return a1.getNombre().compareTo(a2.getNombre());
        }
    }