package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej7 {
    static void main(String[] args) {


        //Crea un método contieneElemento, que acepte un array de enteros y un entero a
        //buscar, que realice la misma operación que el ejercicio anterior, y devuelva un valor
        //booleano que indique si el array contiene el elemento o no

        int buscar =0;
        int tamaño =0;

        tamaño = MiEntradaSalida.leerEnteroPositivo("Dime el tamaño");
        buscar = MiEntradaSalida.leerEnteroPositivo("Dime el numero a buscar");

        //LLAMAR A LA CLASE
        boolean encontrado = crearArray(tamaño, buscar);

        int[] array;
        array = new int[tamaño];

        //MOSTRAR RESULTADO
        if (encontrado == true) {System.out.println("encontrado");} else {System.out.println("no encontrado");}

    }

    //CLASE
    static boolean crearArray (int tamaño, int buscar) {

        boolean encontrado = false;

        int[] array;
        array = new int[tamaño];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscar) {encontrado = true;}
        }

        return encontrado;
    }
}
