package ExamenPasado;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        try (BufferedReader leer = new BufferedReader(new FileReader("Black.html"))){ 
            String antispam = null;
            while ((antispam = leer.readLine()) != null) {
                if ((antispam.contains("style=\"display:none;") ||
                        (antispam.contains("style=\"visibility:hidden;") ||
                        (antispam.contains("style=\"font-size:0px;"))))) {
                    System.out.println("Black SEO: " + antispam);
                }
            }
        } catch (IOException e) {
            System.err.println("Error = " +  e.getMessage());
        }
    }
}