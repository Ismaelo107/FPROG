package T4.A7.E2;

import java.util.HashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {

        Set<Integer> bombo = new HashSet<>();
        Set<Integer> carton = new HashSet<>();
        int cont = 0;

        //Carton
        for (int i = 0; i < 10; i++) {
            carton.add((int) (Math.random() * 101));
        }
        System.out.println("Este es mi cartón");
        System.out.println(carton);

        //Bombo
        boolean entrar = true;
        while (entrar) {
            bombo.add((int) (Math.random() * 101));
            cont++;
            if (bombo.containsAll(carton) || cont == 50) {
                entrar = false;
            }
        }

        if (cont == 50) {
            System.out.println("Losiento has perdido");
        } else {
            System.out.println("Has ganado");
        }
    }
}
