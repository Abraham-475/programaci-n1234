package Cosas;

import java.util.Scanner;

public class MiEntradaSalida {

    //EJEMPLOS CLASES

    //LEER TEXTO EN CADENA
    public static String leercadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        String cadenaintroducida = sc.nextLine();
        return cadenaintroducida;
    }

    //LEER NUMERO ENTERO
    public static int leerentero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        int enterointroducido = sc.nextInt();
        return enterointroducido;
    }

    //LEER NUMERO ENTERO POSITIVO MAYOR QUE CERO
    public static int leerenterom0(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int enterointroducidom0 = 0;
        while (enterointroducidom0 <= 1) {
            System.out.printf("%s: ", mensaje);
            enterointroducidom0 = sc.nextInt();
        }
        return enterointroducidom0;
    }

    //EJEMPLOS LLAMAR CLASES

    //EJ DE MANDAR EL NUMERO ENTERO
    //static void main(String[] args) {
        //int numero = leerentero("Di un numero entero");
        //System.out.println("Tu numero entero es: " + numero);
    //}

    //EJ DE MANDAR EL TEXTO EN CADENA
    //static void main(String[] args) {
        //String nombre = leercadena("Di tu nombre");
        //System.out.println("Tu nombre es: " + nombre);
    //}

    //EJ DE MANDAR EL NUMERO ENTERO POSITIVO MAYOR A 0
    static void main(String[] args) {
        int numero = leerenterom0("Di un numero entero mayor a 0");
        System.out.println("Tu numero es: " + numero);
    }

}
