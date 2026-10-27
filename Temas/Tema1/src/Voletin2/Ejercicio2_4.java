package Voletin2;

import java.util.Scanner;

public class Ejercicio2_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        int valor1 = 0;
        int valor2 = 0;
        int resultado = 0;
        boolean salir = false;

        //REPETIR HASTA QUE EL NUMERO DE POSITIVO Y NO NEGATIVO

        String input = "";
        while (!salir) {
            System.out.println("Escriba un numero positivo, esriba 0 para salir");
            int N = sc.nextInt();

            if (N == 0) {
                salir = true;
            } else {
                if (N >= 0) {
                    valor2 = valor1;
                    valor1 = N;
                    resultado = valor1 + valor2;

                    System.out.println("la suma de " + valor1 + " + " + valor2 + " = " + resultado);

                } else {
                    System.out.println("Escriba un nemro valido");
                }
            }
        }
    }
}
