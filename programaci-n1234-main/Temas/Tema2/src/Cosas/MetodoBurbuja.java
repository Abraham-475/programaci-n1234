package Cosas;

public class MetodoBurbuja {
    static void main(String[] args) {

        // Metodo Burbuja

        // DEFINIR VARIABLES
        int tamaño = 0;
        int[] array;

        // PREGUNTAR TAMAÑO DEL ARRAY
        tamaño = MiEntradaSalida.leerEnteroPositivo("Que tamaño de array quieres");

        // DEFINIR ARRAY
        array = new int[tamaño];

        // PREGUNTAR PARAMETROS DEL ARRAY
        for (int i = 0; i < array.length; i++) {
            array[i] = MiEntradaSalida.leerEnteroPositivo("Dame el valor del " + i);
        }

        // ORDENAR ARRAY CON METODO BURBUJA
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;

                }
            }
        }

        // MOSTRAR RESULTADO
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor de " + i + " es " + array[i]);
        }
    }
}