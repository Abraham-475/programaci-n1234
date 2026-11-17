package Voletin1;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero1 = sc.nextInt();

        System.out.println("Dime otro numero");
        int numero2 = sc.nextInt();

        System.out.println("Dime un tercer numero");
        int numero3 = sc.nextInt();

        System.out.println("Dime un ultimo numero");
        int numero4 = sc.nextInt();

        double Media;
        Media = ((double) numero1 / 4.0) + (numero2 / 4.0) + (numero3 / 4.0) + (numero4 / 4.0);

        System.out.println("La media es " + Media);

        if (numero1 > Media) {
            System.out.println(numero1 + " es mayor a la media");
        }
        if (numero2 > Media) {
            System.out.println(numero2 + " es mayor a la media");
        }
        if (numero3 > Media) {
            System.out.println(numero3 + " es mayor a la media");
        }
        if (numero4 > Media) {
            System.out.println(numero4 + " es mayor a la media");
        }
    }
}