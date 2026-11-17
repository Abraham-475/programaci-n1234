package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej12 {
    static void main(String[] args) {

        //Crea un método que acepte un array de enteros y devuelva el mismo array ordenado
        //de menor a mayor. Utiliza para ello el método de ordenación de la burbuja.

        //DEFINIR VARIABLES
        int tamaño = 0;
        int[] array;

        //preguntar TAMAÑO del array
        tamaño = MiEntradaSalida.leerEnteroPositivo("Que tamaño de array quieres");

        //Definir variable del array
        array = new int[tamaño];

        // PREGUNTAR PARAMETROS DEL ARRAY
        for (int i = 0; i < array.length; i++) {
            array[i] = MiEntradaSalida.leerEnteroPositivo("Dame el valor del " + i);
        }

        array = MiEntradaSalida.ordenarArray(array);

        // MOSTRAR RESULTADO
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor de " + i + " es " + array[i]);
        }
    }
}
