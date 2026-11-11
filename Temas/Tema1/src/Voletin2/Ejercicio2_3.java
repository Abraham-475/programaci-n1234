package Voletin2;

import java.util.Scanner;

public class Ejercicio2_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros = 0;
        int repes = 1;


        boolean encontrado = false;
        String input = "";
        while (!encontrado) {
            System.out.println("Escriba cuantos numeros definir");
            numeros = sc.nextInt();

            if (numeros >= 0) {
                encontrado = true;
            } else {
                System.out.println("numero incorrecto");
            }

            do {

                System.out.println("Escriba el valor de este numero");
                int res1 = sc.nextInt();

                if (res1 % 2 == 0) {
                    System.out.println("Es par");
                } else {
                    System.out.println("Es inpar");
                }

                repes++;
            } while (repes <= numeros);
        }
    }
}