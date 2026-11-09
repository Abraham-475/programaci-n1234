package Cosas;

import java.util.Scanner;

public class MiEntradaSalida {

    //EJEMPLOS CLASES

    //LEER TEXTO EN CADENA
    public static String leerCadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        String cadenaintroducida = sc.nextLine();
        return cadenaintroducida;
    }

    //LEER NUMERO ENTERO
    public static int leerEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        int enterointroducido = sc.nextInt();
        return enterointroducido;
    }

    //LEER NUMERO ENTERO POSITIVO MAYOR QUE CERO
    public static int leerEnteroPositivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int enterointroducidom0 = 0;
        while (enterointroducidom0 < 1) {
            System.out.printf("%s: ", mensaje);
            enterointroducidom0 = sc.nextInt();
        }
        return enterointroducidom0;
    }

    //LEER NUMERO Double
    public static Double leerDouble(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        Double numdouble = sc.nextDouble();
        return numdouble;
    }

    //LEER NUMERO EN RANGO
    public static int leerEnRango(String mensaje, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int numenrango = 0;
        while (numenrango < min || numenrango > max) {
            System.out.printf("%s: ", mensaje);
            numenrango = sc.nextInt();
        }
        return numenrango;
    }
    //LEER CARACTER
    public static char leerCaracter(String mensaje) {
        Scanner sc = new Scanner(System.in);
        char caracter = 0;
            System.out.printf("%s: ", mensaje);
            caracter = sc.next().charAt(0);
        return caracter;
    }

    //LEER VERDADERO O FALSO con s y n
    public static String leerVerdaderoFalso(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String valor = "QuienSabe";
        boolean salir = false;

        while (salir == false) {
            System.out.printf("%s: ", mensaje);
            char caracter = sc.next().toUpperCase().charAt(0);
            if (caracter == 'S') {valor = "S"; salir = true;}
            if (caracter == 'N') {valor = "N"; salir = true;}
        }
        return valor;
    }


}
