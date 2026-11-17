package Voletin1;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una vocal broski");
        char Caracter = sc.next().charAt(0);
        switch (Caracter) {
            case 'a':
            case 'A':
                System.out.println("es la A, la primera vocal");
                break;

            case 'e':
            case 'E':
                System.out.println("es la E, la segunda vocal");
                break;

            case 'i':
            case 'I':
                System.out.println("es la I, la tercera vocal");
                break;

            case 'o':
            case 'O':
                System.out.println("es la O, la cuarta vocal");
                break;

            case 'u':
            case 'U':
                System.out.println("es la U, la quinta vocal");
                break;

            default:
                System.out.println("Escriba una vocal");
        }
    }
}