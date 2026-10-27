
package Sin_Categoria;

import java.util.Scanner;

//HACE UN TRIANGULO CON ASTERISCOS DEFINIENDO LA ALTURA

public class EjercicioCUADRADO {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        int altura = 0;
        String texto = " ";
        String espacios = "  ";

        //PREGUNTAR NUMERO
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Escribe un numero positivo sobre la altura y anchura del cuadrao");
            altura = sc.nextInt();

            if (altura >= 0) {
                //Salir del bucle
                salir = true;
            } else {
                System.out.println("numero incorrecto");
            }
        }

        //CALCULAR

        //DEFINIR ANCHURA
        for (int i = 1; i <= altura; i++) {
            texto = texto + "* ";
        }

        //ALTURA
        for (int i = 1; i <= altura; i++) {

            //MOSTRAR
            System.out.println(" " + texto);

        }
    }
}
