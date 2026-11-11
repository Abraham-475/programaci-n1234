
package Sin_Categoria;

import java.util.Scanner;

//HACE UN TRIANGULO CON ASTERISCOS DEFINIENDO LA ALTURA

public class EjercicioTRIANGULO {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINIR VARIABLES
        boolean salir = false;
        int altura = 0;
        String texto = " *";
        String espacios = "  ";

        //PREGUNTAR NUMERO
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Escribe un numero positivo sobre la altura del triangulo");
            altura = sc.nextInt();

            if (altura >= 0) {
                //Salir del bucle
                salir = true;
            } else {
                System.out.println("numero incorrecto");
            }
        }

        int contador = altura;

        //CALCULAR
        for (int i = 1; i <= altura; i++) {

            //CALCULAR ESPACIOS
            espacios = "  ";
            for (int o = 1; o <= contador; o++) {
                espacios = espacios + " ";
            }

            //MOSTRAR
            System.out.println(".   " + espacios + texto);

            //AJUSTAR TEXTO Y CONTADOR
            texto = texto + " *";
            contador = contador - 1;
        }
    }
}
