
package Sin_Categoria;

import java.util.Scanner;

//HACE UN TRIANGULO CON ASTERISCOS DEFINIENDO LA ALTURA

public class EjercicioRECTANGULO {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        boolean salir2 = false;
        int altura = 0;
        int anchura = 0;
        String texto = " ";
        String espacios = "  ";

        //PREGUNTAR ALTURA
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Escribe un numero positivo sobre la altura del rectangulo");
            altura = sc.nextInt();

            if (altura >= 0) {
                //Salir del bucle
                salir = true;
            } else {
                System.out.println("numero incorrecto");
            }
        }

        //PREGUNTAR ANCHURA
        while (!salir2) {

            //PREGUNTAR numero
            System.out.println("Escribe un numero positivo sobre la anchura del rectangulo");
            anchura = sc.nextInt();

            if (anchura >= 0) {
                //Salir del bucle
                salir2 = true;
            } else {
                System.out.println("numero incorrecto");
            }
        }
        //CALCULAR

        //DEFINIR ANCHURA
        for (int i = 1; i <= anchura; i++) {
            texto = texto + "* ";
        }

        //ALTURA
        for (int i = 1; i <= altura; i++) {

            //MOSTRAR
            System.out.println(" " + texto);
        }
    }
}
