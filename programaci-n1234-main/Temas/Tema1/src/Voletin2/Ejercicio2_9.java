package Voletin2;

import java.util.Scanner;

// Realizar un programa que lea un número entero positivo y averigüe si es
//perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
//excepto él mismo. Diseñar el programa de forma que si algún dato es
//incorrecto vuelva a solicitarse.

public class Ejercicio2_9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        boolean perfecto = false;
        int numero = 0;
        int sumadivisores = 0;

        while (!salir) {
            //PREGUNTAR CUANTOS NUMEROS ESTABLECER
            System.out.println("Escribe un numero positivo y entero");
            numero = sc.nextInt();

            //COMPROVAR SI EL NUMERO ESTABLECIDO ES VALIDO
            if (numero < 0) {
                salir = false;
                System.out.println("Numero incorrecto, repitalo");
            } else {

                // CALCULAR SI ES PERFECTO
                sumadivisores = 0;

                for (int i = 1; i < numero; i++) {
                    if (numero % i == 0) {
                        sumadivisores = sumadivisores + i;
                    }
                }

                if (sumadivisores == numero) {
                    perfecto = true;
                } else {
                    perfecto = false;
                }

                //DAR RESULTADO
                if (perfecto == true) {
                    System.out.println("Numero perfecto");
                } else {
                    System.out.println("Numero inperfecto");
                    System.out.println("Suma de los divisores = " + sumadivisores);
                }

                salir = true;
            }
        }
    }
}
