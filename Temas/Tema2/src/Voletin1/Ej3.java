package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej3 {
    static void main(String[] args) {


        //Crea un programa que pregunte cuántos elementos tendremos en un array de
        //enteros. Posteriormente se preguntarán tantos números como haya indicado el
        //usuario. Posteriormente, mostraremos por pantalla el mayor, el menor y la media. Si
        //el número mayor o menor están repetidos, deberá indicarse cuántas veces se repite.

        //Definir variables
        int repesArray = 0;
        int[] miArray;
        int mayorNumero =0;
        int repetirMayor =0;
        int menorNumero =99999999;
        int repetirMenor =0;
        double media = 0;

        //ESTABLECER TAMAÑO ARRAY
        repesArray = MiEntradaSalida.leerEnteroPositivo("Introduzca la cantidad de numeros a definir");
        miArray = new int[repesArray];

        //ESTABLECER VALORES EN ARRAY
        for (int i = 0; i < repesArray; i++) {
            miArray[i] = MiEntradaSalida.leerEnteroPositivo("Introduzca el valor " + (i + 1));
        }

        //CALCULAR NUMERO MAYOR EN ARRAY
        for (int i = 0; i < repesArray; i++) {
            if (miArray[i] > mayorNumero) {
                mayorNumero = miArray[i];
            }
        }
        for (int i = 0; i < repesArray; i++) {
            if (miArray[i] == mayorNumero) {
                repetirMayor++;
            }
        }

        //CALCULAR NUMERO MENOR EN ARRAY
        for (int i = 0; i < repesArray; i++) {
            if (miArray[i] < menorNumero) {
                menorNumero = miArray[i];
            }
        }
        for (int i = 0; i < repesArray; i++) {
            if (miArray[i] == menorNumero) {
                repetirMenor++;
            }
        }

        //CALCULAR MEDIA DEL ARRAY
        for (int i = 0; i < repesArray; i++) {
            media = media + miArray[i];
        }
        media = media / repesArray;

        //MOSTRAR RESPUESTA
        System.out.println("Mayor numero es " + mayorNumero + " Repetido " + repetirMayor + " veces");
        System.out.println("Menor numero es " + menorNumero + " Repetido " + repetirMenor + " veces");
        System.out.println("La media es " + media);
    }
}
