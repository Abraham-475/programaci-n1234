package Voletin3;

import java.util.Scanner;

//Realiza un programa que convierta números romanos a números en base decimal

public class Ejercicio3_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        char letra = 'a';
        String numerosr = "";
        int suma = 0;
        int valor = 0;
        int valorantiguo = 1001;
        boolean primernumero = true;

        //PREGUNTAR NUMERO
        while (!salir) {
            System.out.println("Escribe una cifra en numeros romanos (I, V, X, L, C, D, M)");
            numerosr = sc.next();

            //PASAR A MAYUSCULAS
            numerosr = numerosr.toUpperCase();
            salir = true;
        }

        for (int i = 0; i < numerosr.length(); i++) {

            //ASIGNAR EL VALOR DE LETRA SEGUN EL CARACTER
            letra = numerosr.charAt(i);

            //Comprueva con el switch
            switch (letra) {
                case 'I':
                    valor = 1;
                    break;
                case 'V':
                    valor = 5;
                    break;
                case 'X':
                    valor = 10;
                    break;
                case 'L':
                    valor = 50;
                    break;
                case 'C':
                    valor = 100;
                    break;
                case 'D':
                    valor = 500;
                    break;
                case 'M':
                    valor = 1000;
                    break;

                default:
                    System.out.println("Caracter " + i + " irreconocido");
            }

            //SABER SI SUMAR O RESTAR
            if (valorantiguo >= valor) {
                suma = suma + valor;
            } else {
                suma = suma + valor - (2 * valorantiguo);
            }

            valorantiguo = valor;

        }

        //MOSTRAR RESULTADO
        System.out.println("El valor de tu numero romano es: " + suma);
    }
}
