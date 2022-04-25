package T8.A1.Comparator;

import java.util.Comparator;

public class SortAlumno implements Comparator<Alumno> {
        @Override
        public int compare(Alumno o1, Alumno o2){
                return o1.getDni().compareTo(o2.getDni());
        }
}
