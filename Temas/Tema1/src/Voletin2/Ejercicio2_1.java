package Voletin2;

import java.util.Scanner;

public class Ejercicio2_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        for (int i = 1; i <= 100; i++) {

            numero ++;

            if (numero % 7 == 0) {
                System.out.println(numero + " es divisor de 7");
            }

            if (numero % 13 == 0) {
                System.out.println(numero + " es divisor de 13");
            }
        }
    }
}
