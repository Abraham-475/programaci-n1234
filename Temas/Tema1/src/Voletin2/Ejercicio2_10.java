package Voletin2;

import java.util.Scanner;

//Realizar un programa que solicite un número entero positivo o cero y
//calcule su factorial. Diseñar el programa de forma que si algún dato es
//incorrecto vuelva a solicitarse.

public class Ejercicio2_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        int numero = 0;
        int total = 1;

        //PREGUNTAR NUMERO
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Escribe un numero positivo y entero, puede ser 0");
            numero = sc.nextInt();

            if (numero >= 0) {
                //Salir del bucle
                salir = true;
            } else {
                System.out.println("numero incorrecto");
            }
        }

        //CALCULAR FACTORIAL
        for (int i = 1; i <= numero; i++) {
            total = i * total;
        }

        //MOSTRAR RESULTADO
        System.out.println("El factorial es " + total);
    }
}
