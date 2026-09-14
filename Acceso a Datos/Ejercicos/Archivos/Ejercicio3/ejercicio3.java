package Ejercicio3;

import java.io.File;
import java.util.Scanner;

public class ejercicio3 {
     public static void main(String[] args) throws Exception {

        File f = new File("fichero1.txt");
        Scanner sc = new Scanner(f);

        char letra = 'a';
        int contador = 0;

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();

            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) == letra) {
                    contador++;
                }
            }
        }

        System.out.println("Aparece " + contador + " veces");
    }
}
