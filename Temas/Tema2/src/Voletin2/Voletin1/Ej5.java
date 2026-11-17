package Voletin2.Voletin1;

import Cosas.MiEntradaSalida;

//Crea un método que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, pero leídos por columnas

public class Ej5 {

    public static void main(String[] args) {
        // Definir variables y matriz
        int[][] matriz;
        int filas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de la matriz");
        int columnas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de columnas de la matriz");
        matriz = new int[filas][columnas];

        // Preguntar valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = MiEntradaSalida.leerEnteroPositivo("En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        // Llamar al método para mostrar la matriz
        mostrar(matriz);
    }

    public static void mostrar(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
}
