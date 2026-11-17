package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej6 {
    static void main(String[] args) {

        //Crea un programa que compruebe si un array contiene un determinado valor. Para
        //ello, puedes pedir por parámetros el tamaño del array, los elementos y luego el
        //elemento a buscar, o puedes generar el array aleatorio y pedir únicamente el
        //elemento a buscar.

        //preguntar valores aleatorios?
        String aleatorio = "h";
        aleatorio = MiEntradaSalida.leerVerdaderoFalso("Quieres valores de array aleatorios o manuales, aleatorios S, manuales N");

        //DEFINI VARIABLES
        int buscar = 0;
        int enterointroducidom0 = 0;
        int[] numerosArray;

        if (aleatorio == "S"){

            //Asignar valor del array

            enterointroducidom0 = (int) (Math.random() * 101);

            //Definir variable del array
            numerosArray = new int[enterointroducidom0];

            //PREGUNTAR PARAMETROS DEL ARRAY
            for (int i = 0; i < numerosArray.length; i++) {
                numerosArray[i] = (int) (Math.random() * 101);
            }

        } else {

            //preguntar valor del array
            enterointroducidom0 = MiEntradaSalida.leerEnteroPositivo("Que tamaño de array quieres");

            //Definir variable del array
            numerosArray = new int[enterointroducidom0];

            //PREGUNTAR PARAMETROS DEL ARRAY
            for (int i = 0; i < numerosArray.length; i++) {
                numerosArray[i] = MiEntradaSalida.leerEnteroPositivo("Dame el valor del " + i);
            }
        }

        //PREGUNTAR ELEMENTO A BUSCAR
        buscar = MiEntradaSalida.leerEnteroPositivo("Dame el valor que quieras buscar (numeros enteros namas)");

        //BUSCAR EL VALOR
        boolean encontrado = false;
        for (int i = 0; i < numerosArray.length; i++) {
            if (buscar == numerosArray[i]){
                System.out.println("Encontrado en el valor " + i + " del array");
                i = numerosArray.length;
                encontrado = true;
            }
        }
        if (encontrado = false) {System.out.println("no se ha encontrado");}
    }
}
