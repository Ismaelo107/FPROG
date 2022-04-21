package T4.A7.E2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bingo2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Set<Integer> carton = new TreeSet<>();
        Set<Integer> bolasTotales = new TreeSet<>();
        int contador = 0;

        /*Añadimos diez numeros aleatorios de 0 a 11 a mi cartón*/
        for (int i = 0; i < 10; i++) {
            carton.add((int) Math.floor(Math.random() * 100 + 1));
        }
        System.out.print("Carton: ");
        for (Integer cart : carton
        ) {
            System.out.print(cart + " ");
        }
        /*Sacamos bolas hasta que finaliza la partida, y se almacenan
        en un nuevo set */
        boolean entrar = true;
        while (entrar) {
            bolasTotales.add((int) Math.floor(Math.random()) * 100 + 1);
            contador++;
            /*Condición para que salga de la aplicacion si el cartón  contiene
            todos los números, o si llega a los 50 intentos */
            if (bolasTotales.containsAll(carton) || contador == 500) {
                entrar = false;
            }
        }
        if (contador == 50) {
            System.out.println(" ");
            System.out.println("Lo sentimos, has alcanzado los 50 numeros, suerte en la proxima");
        } else {
            System.out.println(" ");
            System.out.println("Has ganado la partida");
        }
    }

}
