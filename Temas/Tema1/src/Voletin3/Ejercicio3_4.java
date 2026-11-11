
package Voletin3;

import java.util.Scanner;

//Realiza un programa que pregunte al usuario la hora actual (hora, minutos y
//segundos), y luego pregunte otra hora que deberá sumar a la primera, teniendo en
//cuenta el cambio de día.

public class Ejercicio3_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;

        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int horas2 = 0;
        int minutos2 = 0;
        int segundos2 = 0;
        boolean dia = false;

        //PREGUNTAR HORA
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Introduce la hora base");
            horas = sc.nextInt();

            if (horas >= 0) {
                if (horas <= 24) {
                    //Salir del bucle
                    salir = true;
                } else {
                    System.out.println("hora incorrecta");
                }
            }
        }

        salir = false;

        //PREGUNTAR MINUTOS
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Introduce los minutos base");
            minutos = sc.nextInt();

            if (minutos >= 0) {
                if (minutos <= 60) {
                    //Salir del bucle
                    salir = true;
                } else {
                    System.out.println("minutos incorrectos");
                }
            }
        }

        salir = false;

        //PREGUNTAR SEGUNDOS
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Introduce los segundos base");
            segundos = sc.nextInt();

            if (segundos >= 0) {
                if (segundos <= 60) {
                    //Salir del bucle
                    salir = true;
                } else {
                    System.out.println("segundos incorrectos");
                }
            }
        }

        salir = false;

        //PREGUNTAS PA SUMAR VALORES

        //SUMAR HORA
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Introduce las horas para agregar");
            horas2 = sc.nextInt();

            if (horas2 >= 0) {
                if (horas2 <= 23) {
                    horas = horas + horas2;
                    //Salir del bucle
                    salir = true;
                } else {
                    System.out.println("hora incorrecta");
                }
            }
        }

        salir = false;

        //SUMAR MINUTOS
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Introduce los minutos para agregar");
            minutos2 = sc.nextInt();

            if (minutos2 >= 0) {
                if (minutos2 <= 59) {
                    minutos = minutos + minutos2;
                    //Salir del bucle
                    salir = true;
                } else {
                    System.out.println("minutos incorrectos");
                }
            }
        }

        salir = false;

        //SUMAR SEGUNDOS
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Introduce los segundos para agregar");
            segundos2 = sc.nextInt();

            if (segundos2 >= 0) {
                if (segundos2 <= 59) {
                    segundos = segundos + segundos2;
                    //Salir del bucle
                    salir = true;
                } else {
                    System.out.println("segundos incorrectos");
                }
            }
        }

        //CALCULAR SUMA

        while (segundos >= 60) {
            segundos = segundos - 60;
            minutos++;
        }

        while (minutos >= 60) {
            minutos = minutos - 60;
            horas ++;
        }

        while (horas >= 24) {
            horas = horas - 24;
            dia = true;
        }

        //MOSTRAR RESULTADO
        if (dia == true){
            System.out.println("La hora es " + horas + ":" + minutos + ":" + segundos + " (Ha pasado un dia)");
        } else {
            System.out.println("La hora es " + horas + ":" + minutos + ":" + segundos);
        }
    }
}
