package Cosas;

import java.util.Scanner;

public class EjLlamadaMiEntradaSalida {


    //EJEMPLOS LLAMAR CLASES

    //EJ DE MANDAR EL NUMERO ENTERO POSITIVO MAYOR A 0
    static void main(String[] args) {

<<<<<<< HEAD
        //EJ DE MANDAR EL NUMERO ENTERO POSITIVO MAYOR A 0
        //int enterointroducidom0 = MiEntradaSalida.leerEnteroPositivo("Introduce un numero positivo");
        //System.out.println("Tu numero es: " + enterointroducidom0);

        //EJ DE MANDAR EL NUMERO ENTERO ENTERO
        //int enterointroducido = MiEntradaSalida.leerEntero("Introduce un numero");
        //System.out.println("Tu numero es: " + enterointroducido);

        //EJ DE MANDAR EL NUMERO DOUBLE
        //Double numdouble = MiEntradaSalida.leerDouble("Introduce un numero double");
        //System.out.println("Tu numero Double es: " + numdouble);

        //EJ DE MANDAR EL NUMERO EN RANGO
        //int numenrango = MiEntradaSalida.leerEnRango("Introduce un numero entre 5 y 10", 5, 10);
        //System.out.println("Tu numero dentro del rango es: " + numenrango);

        //EJ DE LEER CARACTER
        //char caracter = MiEntradaSalida.leerCaracter("Introduce un caracter");
        //System.out.println("Tu caracter es: " + caracter);
=======
        //DEFINIR VARIABLES NESESARIAS PA LOS EJEMPLOS
        int[] array = {1, 3, 4, 5, 8};

        //EJ DE MANDAR EL NUMERO ENTERO POSITIVO MAYOR A 0
        int enterointroducidom0 = MiEntradaSalida.leerEnteroPositivo("Introduce un numero positivo");
        System.out.println("Tu numero es: " + enterointroducidom0);

        //EJ DE MANDAR EL NUMERO ENTERO ENTERO
        int enterointroducido = MiEntradaSalida.leerEntero("Introduce un numero");
        System.out.println("Tu numero es: " + enterointroducido);

        //EJ DE MANDAR EL NUMERO DOUBLE
        Double numdouble = MiEntradaSalida.leerDouble("Introduce un numero double");
        System.out.println("Tu numero Double es: " + numdouble);

        //EJ DE MANDAR EL NUMERO EN RANGO
        int numenrango = MiEntradaSalida.leerEnRango("Introduce un numero entre 5 y 10", 5, 10);
        System.out.println("Tu numero dentro del rango es: " + numenrango);

        //EJ DE LEER CARACTER
        char caracter = MiEntradaSalida.leerCaracter("Introduce un caracter");
        System.out.println("Tu caracter es: " + caracter);
>>>>>>> a36f2d0 (Ej 14 termnao)

        //EJ DE VERDADERO O FALSO
        String valor = MiEntradaSalida.leerVerdaderoFalso("Introduce S o N para verdadero o falso");
        System.out.println("Tu valor es: " + valor);

<<<<<<< HEAD
=======
        //EJEMPLO ORDENAR ARRAY
        array = MiEntradaSalida.ordenarArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //EJEMPLO ORDENAR Alreves ARRAY
        array = MiEntradaSalida.ordenarArrayAlreves(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


>>>>>>> a36f2d0 (Ej 14 termnao)
    }
}
