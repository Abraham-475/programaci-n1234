package Voletin2;

import java.util.Scanner;

public class Ejercicio2_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero del 0 al 10");

        int numero1 = sc.nextInt();
        int resultado = 0;
        int multiplo = 0;

        if (numero1 >= 0) {
            if (numero1 <= 10) {

                for (int i = 0; i <= 10; i++) {

                    resultado = numero1 * multiplo;

                    System.out.println(numero1 + " x " + i + " = " + resultado);

                    multiplo ++;

                }

            } else {
                System.out.println("Numero mu grande bro");
            }
        } else {
            System.out.println("Numero mu pequeño o no valido bro");
        }
    }
}
