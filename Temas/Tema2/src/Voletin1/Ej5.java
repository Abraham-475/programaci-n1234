package Voletin1;

import Cosas.MiEntradaSalida;
import jdk.dynalink.beans.StaticClass;

public class Ej5 {
    static void main(String[] args) {


        //Crea un método, que acepte un parámetro “tamaño” de tipo entero, que genere un
        //array de “tamaño” posiciones de números aleatorios de 0 a 1000 y lo muestre por
        //pantalla.

        int tamaño =0;
        tamaño = MiEntradaSalida.leerEnteroPositivo("Dime el tamaño");

        //LLAMAR A LA CLASE
        int[] array = crearArray(tamaño);

        //MOSTRAR RESULTADO
        for (int i = 0; i < array.length; i++) {
            System.out.println("valor de " + i + " es " + array[i]);
        }

    }

    //CLASE
    static int[] crearArray (int tamaño) {

        int[] array;
        array = new int[tamaño];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);
        }
        return array;
    }
}
