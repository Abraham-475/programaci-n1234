package Voletin2;

import java.util.Scanner;

//Realizar un programa que solicite un conjunto de números. Después de
//introducir cada número se realizará la pregunta: "¿Desea introducir más
//números (S/N)". Si la respuesta es 'S' se solicitará otro número. Cuando no
//desee introducir más números debe informar cual es el menor de los
//números introducidos.

public class Ejercicio2_8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        boolean salir2 = false;
        int valor = 0;
        int menor = 0;

        //PREGUNTAR CUANTOS NUMEROS ESTABLECER
        System.out.println("Escribe cuantos numeros solicitar");
        int numeros = sc.nextInt();

        //REPETIR LAS VECES QUE ESTABLECES
        for (int i = 1; i <= numeros; i++) {
            while (!salir) {
                //ESTABLECE EL VALOR DE UN NUMERO
                System.out.println("Escriba este numero ");
                valor = sc.nextInt();

                //SI ES UN VALOR CORRECTO SE PROCESA
                if (valor > 0) {
                    salir = true;

                    //COMPROVAR Y ESTABLECER EL MENOR
                    if (valor < menor) {
                        menor = valor;
                    }

                    if (menor == 0) {
                        menor = valor;
                    }

                    salir2 = false;

                    if (i != numeros) {
                        while (!salir2) {
                            //PREGUNTAR SI INTRODUCIR MAS NUMEROS
                            System.out.println("Quieres escribir otro??? responde solo con: S o N");
                            char sn = sc.next().charAt(0);
                            switch (sn) {
                                case 's':
                                case 'S':
                                    System.out.println("Has elegido S");
                                    salir2 = true;
                                    break;
                                case 'n':
                                case 'N':
                                    System.out.println("Has elegido N");
                                    //SETEAR EL CONTADOR PARA SALIR DEL CONTADOR
                                    i = numeros;
                                    salir2 = true;
                                    break;
                                default:
                                    System.out.println("Escribe solo S o N, gil");
                                    //REPETIR LA PREGUNTA
                                    salir2 = false;
                            }
                        }
                    }
                    //SI ES UN VALOR INCORRECTO SE REPITE
                } else {
                    System.out.println("Numero incorrecto, escriba un valor correcto");
                }
            }
            //Hata q no termine el contador no pueda salir del bucle
            salir = false;
        }
        //DECIR EL NUMERO MAS PEQUEÑO
        System.out.println("Numero mas pequeño es " + menor);
    }
}
