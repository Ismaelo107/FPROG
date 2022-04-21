package Tema7.Ejemplo.Ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppFicheros {
    public static void main(String[] args) {

        try {
            File fichero = new File("fichero.txt");
            FileWriter fw = new FileWriter(fichero);
            //Escribimos la cadena
            String cadena = "Hola estoy escribiendo desde Java";
            String caracter = "Hola estoy escribiendo desde Java caracter a caracter";
            fw.write(cadena);
            fw.write("\n");

            //Escribimos caracter a caracter
            for (int i = 0; i <caracter.length(); i++) {
                fw.write(caracter.charAt(i));
            }
            fw.close();

            FileReader fr= new FileReader(fichero);
            int c=fr.read();
            while (c!=-1){
                System.out.print((char) c);
                c= fr.read();
            }
            fr.close();

        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
