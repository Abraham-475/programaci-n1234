package Voletin1;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escruba un numero puto gilipollas");
        int numero1 = sc.nextInt();

        if (numero1 % 2 == 0) {
            System.out.println("Es multiplo de 2");
        }
        if (numero1 % 3 == 0) {
            System.out.println("Es multiplo de 3");
        }
    }
}