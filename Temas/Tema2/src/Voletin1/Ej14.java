package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej14 {
    static void main(String[] args) {

        //Crea un programa que implemente una estructura de cola de números enteros. Una
        //estructura de cola es aquella que permite almacenar elementos de la manera
        //“primero en entrar, primero en salir (FIFO - First in first out)”. Crea un método main,
        //donde hagas llamadas a un método encolar para añadir elementos y otro método
        //desencolar para eliminarlos. Muestra el array tras cada una de las operaciones. La
        //cola tendrá como máximo 10 números enteros. Ejemplo de utilización:

        //DEFINIR VARIABLES
        int[] cola;
        cola = new int[10];
        int[] orden;
        orden = new int[10];
        int contadorTotal = 0;
        int elección = 0;

        //BUCLE
        while (elección != 4){

            //PREGUNTAR ELECCION
            System.out.println("tienes ocupados " + contadorTotal + " espacios de la array cola");
            elección = MiEntradaSalida.leerOpcionesNumeros("Añadir valor (1) quitar valor (2) mostrar array (3) salir del programa (4)", 4);

            //MANDAR A QUE METODO HACER:

            //Mandar añadir
            if (elección == 1) {
                if (contadorTotal <= 9) {

                    //MANDAR AÑADIR EL VALOR
                    cola[contadorTotal] = añadirValor();
                    contadorTotal++;

                } else {
                    System.out.println("No ahi suficiente espacio broski");
                }
            }

            //Mandar Quitar
            if (elección == 2) {
                if (contadorTotal > 0) {

                    quitarValor(cola[0]);

                    for (int i = 0; i < contadorTotal - 1; i++) {
                        cola[i] = cola[i + 1];
                    }

                    cola[contadorTotal - 1] = 0;
                    contadorTotal--;
                }
            }

            //Mandar mostrar
            if (elección == 3) {
                for (int i = 0; i < cola.length; i++) {
                    System.out.println("valor nuemro " + i + " es " + cola[i]);
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
    static int quitarValor(int espacio) {
        System.out.println("quitado el valor " + espacio);
        return espacio;
    }
}
