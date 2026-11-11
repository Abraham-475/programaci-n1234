package Voletin2;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Ejercicio2_6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        System.out.println("Escribe un numero ");
        int numeroA = sc.nextInt();
        System.out.println("Escribe otro numero ");
        int numeroB = sc.nextInt();
        int resultado = 0;

        //SUMAR B + B EL NUMERO DE VECES DE A
        for (int i = 1; i <= numeroA; i++) {

            resultado = resultado + numeroB;

        }

        //DAR RESULTADO
        System.out.println("El resultado de " + numeroA + " multiplicado por " + numeroB + " es " + resultado);
    }
}
