package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej11 {
    static void main(String[] args) {

        //Crea un método que acepte 2 arrays, y devuelva un nuevo array con los elementos
        //que ambos arrays tienen en común.

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

        //PREGUNTAR PARAMETROS DEL ARRAY 1
        System.out.println("Dime los valores del primer array");
        for (int i = 0; i < array.length; i++) {
            array[i] = MiEntradaSalida.leerEnteroPositivo("Dame el valor del " + i);
        }

        //PREGUNTAR PARAMETROS DEL ARRAY 2
        System.out.println("Dime los valores del segundo array");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = MiEntradaSalida.leerEnteroPositivo("Dame el valor del " + i);
        }

        //MOSTRAR VALORES EN COMUN
        System.out.println("Estos son los valores en comun");
        arrayFinal = conprovarComun(array, array2);
        for (int i = 0; i < array2.length; i++) {
            if (arrayFinal[i] != 0) { System.out.println("valor " + arrayFinal[i] + " en el espacio " + i);}
        }
    }

    //Metodo pa comprova que tienen en comun esas arrays
    static int[] conprovarComun(int[] array1, int[] array2){
        int[] resultado;
        resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {resultado[i] = array1[i];}
        }
        return resultado;
    }
}
