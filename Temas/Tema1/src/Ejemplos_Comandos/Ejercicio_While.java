package Ejemplos_Comandos;

import java.util.Scanner;

public class Ejercicio_While {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean encontrado= false;
        int i = 2;

        System.out.println("Escriba un numero.");
        int Numero1 = sc.nextInt();

        while (!encontrado) {

            if (Numero1%i == 0) {
                System.out.println("Tu numero es discble por " + i);
                encontrado = true;
            }
            i++;
        }
    }
}