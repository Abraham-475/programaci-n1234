package Voletin2.Voletin1;

import Cosas.MiEntradaSalida;

public class Ej4 {

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

    // El método pa mostra
    public static void mostrar(int[][] matriz) {

        for (int i = matriz.length - 1; i >= 0; i--) {

            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
}
