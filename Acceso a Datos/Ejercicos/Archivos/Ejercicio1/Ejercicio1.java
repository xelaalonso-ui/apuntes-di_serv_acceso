package Ejercicio1;

import java.io.File;

public class Ejercicio1 {
    public static void archibo() {
        File fichero = new File("C:\\Users\\USUARIO\\Desktop\\Curso_repetido\\Acceso a Datos\\Ejercicos\\Archivos\\Ejercicio1");
        //para listar los archivos dentro de la carpera es 
        File[] lista=fichero.listFiles();
        System.out.println("DIRECTORIOS:");
        for (File f : lista) {
            if (f.isDirectory()) {
                System.out.println(f.getName());
            }
        }

        System.out.println("\nFICHEROS:");
        for (File f : lista) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }

    

    public static void main(String[] args) {
        archibo();
    }

}