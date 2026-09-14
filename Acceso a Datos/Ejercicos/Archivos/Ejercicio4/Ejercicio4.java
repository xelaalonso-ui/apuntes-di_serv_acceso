package Ejercicio4;

import java.io.File;
import java.util.Scanner;

public class Ejercicio4 {
       public static void main(String[] args) throws Exception {

        File f = new File("fichero1.txt");
        Scanner sc = new Scanner(f);

        int[] contador = new int[256];

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();

            for (int i = 0; i < linea.length(); i++) {
                contador[linea.charAt(i)]++;
            }
        }

        int max = 0;
        char masUsado = ' ';

        for (int i = 0; i < 256; i++) {
            if (contador[i] > max) {
                max = contador[i];
                masUsado = (char) i;
            }
        }

        System.out.println("Más usado: " + masUsado);
    }
}
