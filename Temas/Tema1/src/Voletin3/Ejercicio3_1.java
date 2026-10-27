
package Voletin3;

import java.util.Scanner;

//Realizar un programa que, dado un número introducido por el usuario, calcule su
//número a la inversa. Es decir, dada la entrada: 123456, el programa debe devolver
//654321. Para este programa, no se deben utilizar métodos de la clase String,
//Integer, o arrays; sólo deben utilizarse operaciones matemáticas. Ten en cuenta solo
//valores positivos.

public class Ejercicio3_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        int numero = 0;

        //ASIGNAR VARIABLES
        int invertido = 0;
        int cifra = 0;

        //PREGUNTAR NUMERO
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Escribe un numero positivo y entero, de mas de 1 cifra");
            numero = sc.nextInt();

            if (numero >= 10) {
                //Salir del bucle
                salir = true;
            } else {
                System.out.println("numero incorrecto");
            }
        }

        //CALCULAR INVERTIDO
        while (numero > 0) {
            cifra = (numero % 10);
            invertido = invertido * 10 + cifra;
            numero = numero / 10;
        }

        //MOSTRAR RESULTADO
        System.out.println("El numero invertido es " + invertido);
    }
}
