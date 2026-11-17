package Voletin2.Voletin1;

import Cosas.MiEntradaSalida;

public class Ej3 {

    public static void main(String[] args) {

        // Definir variables, arrays y matrices
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

    // Método para mostrar la matriz leída por filas en orden normal
    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
}
