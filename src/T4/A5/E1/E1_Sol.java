package T4.A5.E1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E1_Sol {
    public static void main(String[] args) {

        // añado los numeros aleatorios a la lista
        List<Integer> listaNum = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listaNum.add((int) (Math.random() * 10));
        }

        // Imprimo los números aleatorios generados
        for (Integer num : listaNum
        ) {
            System.out.println(num);
        }

        // Creo conjunto que por tanto tendrá elementos únicos

        Set<Integer> conjuntoNum = new HashSet<>();
        conjuntoNum.addAll(listaNum);
        // imprimo conjuntos

        System.out.println("### Imprimiendo conjunto de elementos sin repetir ###");
        for (Integer num : conjuntoNum
        ) {
            System.out.println(num);
        }

        // Elementos repetidos
        List<Integer> elementosRepetidos = new ArrayList<>();

        elementosRepetidos.addAll(listaNum);
        // elementosRepetidos.removeAll(conjuntoNum);   con esta sentetncia comentada se eliminarian todos.
        // recorremos el conjunto y eliminamos en la lista, de esta forma nos quedan los repetidos.
        for (Integer e : conjuntoNum) {
            elementosRepetidos.remove(e);
        }

        // vuelvo a pasarlos a un set por si hubiera elementos repetidos mas de una vez
        Set<Integer> conjuntoElementosRepe = new HashSet<>();
        conjuntoElementosRepe.addAll(elementosRepetidos);

        System.out.println("### Imprimiendo conjunto de elementos repetidos ###");
        for (Integer num : conjuntoElementosRepe
        ) {
            System.out.println(num);
        }

    }
}

