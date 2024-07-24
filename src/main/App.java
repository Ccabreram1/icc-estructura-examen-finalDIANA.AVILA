package main;

import java.util.ArrayList;
import java.util.List;

import main.Models.Estudiante;

public class App {
    public static String main(String[] args, int calificacion) throws Exception {

        System.out.println("Ejercicio 1");

        ArrayList<Estudiante> = new ArrayList<>();
        //listar


        //imprimir la lista de estudiantes

        System.out.println("Estudiantes ordenados por calificacion");
        //utilizo el metodo de ordenamiento por calificaciones

        //en donde dependiendo el return y del if imprima el orden
         

        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else {
            return "F";
        }


        System.out.println("Agrupacion por categorias");

        //utilizo el metodo de agrupacion con calificaciones en comun

        //en donde el metodo pueda escoger que calificaciones son comunes
        //y ponerlas en el mismo grupo.

        //se utiliza agrupacion por defecto del computador que cual cree y es lo correcto


        System.out.println("Ejercicio 2");
        System.out.println("Ejemplo de entrada");
        //por defecto
        System.out.println("Ejemplo de Salida"); //por defecto
        System.out.println("Frecuencia de Palabras");

        // se utiliza un recorrido  con HashMap
        //en donde vaya buscando entre cada palabra la frecuencia
        //cada anexo


        
        System.out.println("Ejercicio 3");
        System.out.println("Ejemplo de entrada");
        System.out.println("Ejemplo de Salida");














    }
}
