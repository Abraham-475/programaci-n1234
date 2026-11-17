package Voletin2;

import java.util.Scanner;

public class Ejercicio2_5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        int numeros = 0;

        //REPETIR HASTA QUE EL NUMERO DE POSITIVO Y NO NEGATIVO

        String input = "";
        while (!salir) {
            System.out.println("Escriba un numero positivo, esriba uno negativo para terminar");
            int n = sc.nextInt();

            if (n < 0) {
                salir = true;
            } else {
                numeros ++;
            }
        }

        System.out.println("Se han introducido " + numeros + "numeros" );

    }
}
