package T7.Ejemplo.Buffer;

import java.io.*;


public class AppBuffer {
    public static void main(String[] args) {

        try {
            File fichero = new File("ficheroBuffer.txt");
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            String cad = "Esto es una prueba de escritura de fichero utilizando buffer";
            bw.write(cad);
            bw.close();
            fw.close();

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea!=null){
                System.out.println(linea);
                linea= br.readLine();
            }

        } catch (IOException e){
            System.out.println("Error");
        }
    }
}
