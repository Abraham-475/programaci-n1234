package Ejemplos_Comandos;

import java.util.Scanner;

public class Ejercicio_DoWhyle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "0";

        do {

            System.out.println("escriba contraseña, para nada es 123");
            int Numero2 = sc.nextInt();

        }   while (password != "123");

        System.out.println("estas dentro");
    }
}