package Ejercicio2;

import java.io.File;

public class Ejercicio2 {
    public static void listar(File dir) {
        File[] lista = dir.listFiles();

        for (File f : lista) {
            System.out.println(f.getAbsolutePath());

            if (f.isDirectory()) {
                listar(f); // entra en subcarpetas
            }
        }
    }

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Xela\\Desktop");
        listar(dir);
    }
}
