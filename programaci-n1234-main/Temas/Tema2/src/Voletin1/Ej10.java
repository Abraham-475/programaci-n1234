package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej10 {
    static void main(String[] args) {

        //Crea un array que devuelva un nuevo array donde se hayan eliminado los elementos
        //duplicados del primero.

        //DEFINIR VARIABLES
        int tamaño = 0;
        int[] array;
        int[] array2;
        int[] arrayFinal;

        //preguntar valor del array
        tamaño = MiEntradaSalida.leerEnteroPositivo("Que tamaño de array quieres");

        //Definir variable del array
        array = new int[tamaño];
        array2 = new int[tamaño];
        arrayFinal = new int[tamaño];
        int contador = 0;

        //PREGUNTAR PARAMETROS DEL ARRAY
        for (int i = 0; i < array.length; i++) {
            array[i] = MiEntradaSalida.leerEnteroPositivo("Dame el valor del " + i);
        }

        //COMPROVAR NUMEROS IDENTICOS
        for (int i = 0; i < array.length; i++) {

            boolean numeroValido = true;

            if (!arrayContieneElemento(array2, array[i])){
                array2[contador++] = array[i];
            }
        }

        //MOSTRAR RESULTADO
        for (int i = 0; i < array2.length; i++) {
            System.out.println("valor de " + i + " es " + array2[i]);
        }
    }

    static boolean arrayContieneElemento(int[] array, int elementoABuscar) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == elementoABuscar){
                return true;
            }
        }
        return false;
    }
}
