
package Voletin3;

import java.util.Scanner;

//Basándote en la implementación del ejercicio anterior, realiza un programa que
//determine si un número es un capicúa. Es decir, si se lee igual de atrás hacia
//delante que de adelante hacia atrás.

public class Ejercicio3_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        boolean capicua = false;
        int numero = 0;
        int ultimodigito = 0;
        int primerdigito = 0;

        //PREGUNTAR NUMERO
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Escribe un numero positivo y entero, de mas de 1 cifra");
            numero = sc.nextInt();

            if (numero >= 10) {
                //Salir del bucle
                salir = true;
            } else {
                System.out.println("numero incorrecto");
            }
        }

        //CALCULAR capicúa
        ultimodigito = (numero % 10);

        while (numero > 0) {
            primerdigito = (numero % 10);
            numero = numero / 10;
        }

        if (ultimodigito == primerdigito) {
            System.out.println("Este numero SI es capicua");
        } else {
            System.out.println("Este numero NO es capicua");
        }

        //MOSTRAR RESULTADO
        System.out.println("El ultimo digito es " + ultimodigito);
        System.out.println("El primer digito es " + primerdigito);
    }
}
