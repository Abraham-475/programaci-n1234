package Voletin2;

import java.util.Scanner;

//Realizar un programa que solicite una cantidad de números que van a
//pedirse por teclado. Una vez que solicite todos ellos debe informar de cual
//es la media de los números. Diseñar el programa de forma que si la
//cantidad es incorrecta vuelva a solicitarse.

public class Ejercicio2_7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        int valor = 0;
        double media = 0;
        double suma = 0;
        boolean salir = false;
        int numeros = 0;

        String input = "";
        while (!salir) {

            System.out.println("Escribe la cantidad de numeros a comparar");
            numeros = sc.nextInt();

            if (numeros > 0) {
                salir = true;
            } else {
                System.out.println("No se pueden definir una cantidad negativa de numeros");
            }
        }

        salir = false;

        //REPETIR LAS VECES QUE ESTABLECES
        for (int i = 1; i <= numeros; i++) {
            while (!salir) {
                //ESTABLECE EL VALOR DE UN NUMERO
                System.out.println("Escriba este numero ");
                valor = sc.nextInt();

                //SI ES UN VALOR INCORRECTO SE REPITE
                if (valor > 0) {
                    salir = true;
                } else {
                    System.out.println("Numero incorrecto, escriba un valor correcto");
                }
            }
            //Hata q no termine el contador no pueda salir del bucle
            salir = false;
            //SUMA EL VALOR A LA MEDIA
            suma = suma + valor;
        }

        //HACE LA MEDIA DE LOS VALORES
        media = suma / numeros;

        //DAR RESULTADO
        System.out.println("La media es " + media);
    }
}
