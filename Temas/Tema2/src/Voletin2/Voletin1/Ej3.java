package Voletin2.Voletin1;

import Cosas.MiEntradaSalida;

import javax.swing.*;

public class Ej3 {
    static void main(String[] args) {

        //Crea un método que reciba una matriz e imprima, en una sola línea, los elementos de la
        //misma, leídos por filas:

        //Defini variables, arrays y matrices
        int[][] matriz;
        int filas = MiEntradaSalida.leerEnteroPositivo("Dime el tamañp de la fila de la matriz");
        int columnas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de la matriz");
        matriz = new int[filas][columnas];

        //Preguntar valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz [i][j] = MiEntradaSalida.leerEnteroPositivo("En la fla " + i + " dime el valor de " + j);

            }
        }
        

        //Mostrar
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j] + " ");

            }
        }
    }
}
