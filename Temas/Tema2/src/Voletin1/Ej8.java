package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej8 {
    static void main(String[] args) {

        //Crea un método que devuelva la posición que ocupa un valor dentro de un array, o
        //-1 si el array no contiene ese valor

        int tamaño = MiEntradaSalida.leerEnteroPositivo("Dime el tamaño del array");

        int[] array;
        array = new int[tamaño];

        for (int i = 0; i < array.length; i++) {
            array[i] =MiEntradaSalida.leerEnteroPositivo("Dime el valor " + i );
        }
        int posision = MiEntradaSalida.leerEnteroPositivo("Dime la posision del valor que quieras buscar");

        //LLAMAR A LA CLASE
        int encontrado = crearArray(posision, array);

        //MOSTRAR RESULTADO
        System.out.println("El valor encontrado en la posision " + posision + " es " + encontrado);

    }

    //CLASE
    static int crearArray (int posision, int[] tamaño) {

        int encontrado = tamaño[posision];
        if (tamaño[posision] == 0) {encontrado = -1;}

        return encontrado;
    }
}
