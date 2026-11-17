package Ejemplos_Comandos;

import java.util.Scanner;

public class Repetir_hasta_que {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;

        //REPETIR HASTA QUE SALIR SEA POSITIVO

        String input = "";
        while (!salir) {
            System.out.println("Escriba un numero, esriba 0 para salir");
            int N = sc.nextInt();

            if (N == 0) {
                salir = true;
            } else {
                if (N >= 0) {

                    System.out.println("Numero es " + N );

                } else {
                    System.out.println("Escriba un nemro valido");
                }
            }
        }
    }
}