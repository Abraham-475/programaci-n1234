package Voletin1;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu edad");
        int numero1 = sc.nextInt();

        if (numero1 >= 101) {
            System.out.println("No puedes tener mas d 100 anios");
        } else {
            if (numero1 < 13) {
                System.out.println("Eres un niño");
            } else {
                if (numero1 < 18) {
                    System.out.println("Eres un adolescente");
                } else {
                    if (numero1 < 30) {
                        System.out.println("Eres un joven");
                    } else {
                        if (numero1 > 30) {
                            System.out.println("Eres un adulto");
                        }
                    }
                }
            }
        }
    }
}