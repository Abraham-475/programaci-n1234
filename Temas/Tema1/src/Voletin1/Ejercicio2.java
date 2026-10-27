package Voletin1;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numeroooo");
        int numero1 = sc.nextInt();

        System.out.println("Introduzca otro numeroooo");
        int Numero2 = sc.nextInt();

        if (numero1 == Numero2) {
            System.out.println("Tus numeros so iguales");
        }
        else {
            if (numero1 > Numero2) {
                System.out.println("El primer numero es mayor");
            }
            else {

            }
            if (numero1 < Numero2) {
                System.out.println("El primer numero es menor");
            }
        }
    }
}