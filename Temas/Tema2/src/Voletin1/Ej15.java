package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej15 {
    static void main(String[] args) {

        //Criba de Eratóstenes: este método sirve para encontrar los números primos
        //existentes sin tener que calcular sus divisores. El método es el siguiente:
        //a. Comenzamos con el número 2. Tacharemos todos los múltiplos de 2 hasta
        //llegar a n (siendo n el número máximo que queremos comprobar).
        //b. Seguiremos con el siguiente número que no esté tachado, y repetiremos el
        //punto a hasta que lleguemos a n.

        //DEFINIR VARIABLES
        boolean[] lista;
        int tamaño = MiEntradaSalida.leerEnteroPositivo("Que tamaño quieres la lista para comprovar numeros pirmos?");
        lista = new boolean[tamaño];
        int multiplo = 0;

        //Comprovar si son primos los numeros
        for (int i = 0; i < lista.length; i++) {
            for (multiplo = 2;multiplo <= 10; multiplo++) {

                if (i % multiplo == 0) { lista[i] = true; }


            }
        }
        for (int i = 0; i < lista.length; i++) {
        if (lista[i] == true) {System.out.println("El numero " + i + "es true");}
        }

    }
}
