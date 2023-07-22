
package compiladores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Raguex
 */
public class Compiladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nombreArchivo = "D:\\SEMESTRE 6\\COMPILADORES\\JAVA\\DATA.txt";
        int contadorLineas = 0;
        int contadorPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contadorLineas++;
                contadorPalabras += contarPalabras(linea);
            }

            System.out.println("Número de líneas en el archivo: " + contadorLineas);
            System.out.println("Número de palabras en el archivo: " + contadorPalabras);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }

    private static int contarPalabras(String linea) {
        if (linea == null || linea.isEmpty()) {
            return 0;
        }
        String[] palabras = linea.trim().split("\\s+");
        return palabras.length;
    }
}