package Fichero;

import java.io.FileWriter;
import java.io.IOException;

public class EstructuraBasica {
    public static void main(String[] args) {
        FileWriter fw = null;
            
        try {
            fw = new FileWriter("datos.txt", true);
            
            fw.write("Primera línea\n");
            fw.write("Segunda línea\n");
            fw.write("Tercera línea\n");
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
