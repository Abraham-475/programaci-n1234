
package Sin_Categoria;

import java.util.Scanner;

//HACE UN TRIANGULO CON ASTERISCOS DEFINIENDO LA ALTURA

public class EjercicioCUADRADOsinvordes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        int altura = 0;
        String vacio = " ";
        String texto = " ";

        //PREGUNTAR NUMERO
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Escribe un numero positivo sobre la altura y anchura del cuadrao vacio");
            altura = sc.nextInt();

            if (altura >= 0) {
                //Salir del bucle
                salir = true;
            } else {
                System.out.println("numero incorrecto");
            }
        }

        //CALCULAR

        //DEFINIR VARIABLE TEXTO
        for (int i = 1; i <= altura; i++) {
            texto = texto + "*  ";
        }

        //DEFINIR VARIABLE VACIO PA LOS VACIOS DEL CUADRAO
        for (int i = 1; i <= altura; i++) {
            if (i == 1) {
                vacio = vacio + "*  ";
            } else {
                if (i == altura) {
                    vacio = vacio + "*  ";
                } else {
                    vacio = vacio + "   ";
                }
            }
        }

        //MOSTRAR Y DEFINIR CUANTO PA LOS VORDES
        for (int i = 1; i <= altura; i++) {
            if (i == 1) {
                System.out.println(texto);
            } else {
                if (i == altura) {
                    System.out.println(texto);
                } else {
                    System.out.println(vacio);
                }
            }
        }

    }
}
