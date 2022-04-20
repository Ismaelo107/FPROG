package T4.A5.E1;

import java.util.*;

public class E1 {
    public static void main(String[] args) {

        // Añado números aleatorios a una lista
        List<Integer> listaNum = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listaNum.add((int) (Math.random() * 10) + 1);
        }

        // Muestro los números aleatorios
        System.out.println(listaNum);

        // Conjunto con elementos únicos
        Set<Integer> conjuntoNum = new HashSet<>();
        conjuntoNum.addAll(listaNum);

        System.out.println("### Imprimiendo números únicos ###");

        System.out.println(conjuntoNum);

        // Elementos repetidos

        List<Integer> listaRep = new ArrayList<>();

        listaRep.addAll(listaNum);

        for (Integer p :
                conjuntoNum) {
            listaRep.remove(p);
        }

        // Añado la lista de números repetidos a un conjunto por si se repite varias veces

        Set<Integer> conjuntoRep = new HashSet<>();
        conjuntoRep.addAll(listaRep);


        System.out.println("### Imprimiendo números repetidos ###");
        System.out.println(conjuntoRep);


    }
}
