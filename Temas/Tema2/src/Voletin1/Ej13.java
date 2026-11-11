package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej13 {
    static void main(String[] args) {

        //Crea un programa que implemente una estructura de pila de números enteros. Una
        //estructura de pila es aquella que permite almacenar elementos de la manera “último
        //en entrar, primero en salir (LIFO - Last in first out)”. Crea un método main, donde
        //hagas llamadas a un método apilar para añadir elementos y otro método desapilar
        //para eliminarlos. Muestra el array tras cada una de las operaciones. La pila tendrá
        //como máximo 10 números enteros

        //DEFINIR VARIABLES
        int[] pila;
        pila = new int[10];
        int contador = 0;
        int elección = 0;

        //BUCLE
        while (elección != 4){

            //PREGUNTAR ELECCION
            System.out.println("tienes ocupados " + contador + " espacios de la array pila");
            elección = MiEntradaSalida.leerOpcionesNumeros("Añadir valor (1) quitar valor (2) mostrar array (3) salir del programa (4)", 4);

            //MANDAR A QUE METODO HACER:

            //Mandar añadir
            if (elección == 1) {
                if (contador <= 9) {
                    pila[contador] = añadirValor();
                    contador++;
                } else {
                    System.out.println("No ahi suficiente espacio broski");
                }
            }

            //Mandar Quitar
            if (elección == 2) {
                if (contador > 0) {
                    pila[quitarValor(contador)] = 0;
                    contador = contador - 1;
                }
            }

            //Mandar mostrar
            if (elección == 3) {
                for (int i = 0; i < pila.length; i++) {
                    System.out.println("valor nuemro " + i + " es " + pila[i]);
                }
            }

            //SALIR
            if (elección == 4) {
                System.out.println("Bye");
            }
        }
    }

    //AÑADIR VALOR
    static int añadirValor() {
        int valorAñadido = MiEntradaSalida.leerEnteroPositivo("Introduzca el valor a añadir");
        return valorAñadido;
    }

    //Quitar VALOR
    static int quitarValor(int contador) {
        contador = contador - 1;
        System.out.println("quitado el valor " + contador);
        return contador;
    }
}
