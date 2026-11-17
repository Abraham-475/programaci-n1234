package Voletin1;

public class Ej1 {
    static void main(String[] args) {

        //Crea un programa que sume todas las posiciones pares de un array de enteros.

        //Definir variables
        //ARRAY
        int[] enteros = {1, 2, 3, 4, 5, 6};

        System.out.println("el valor es: " + sumaPosisionsPares(enteros));
    }

    //Suma de posisiones
    static int sumaPosisionsPares (int[] enteros){
        int resultado = 0;

        for (int i = 0; i < enteros.length; i++) {
            if (i % 2 == 0) {resultado = resultado + enteros[i];}
        }
        return resultado;
    }

}
