package T7.A1.E1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String keyB ="si";
        try{
            File fichero = new File("fichero.txt");
            FileWriter fw = new FileWriter(fichero);
            while (!keyB.equalsIgnoreCase("no")){
                System.out.println("Escribe...");
                fw.write(sc.next());
                System.out.println("¿Deseas continuar?");
                keyB = sc.next();
            }
            fw.close();




        } catch (IOException e){
            System.out.println("Error");
        }

    }
}
