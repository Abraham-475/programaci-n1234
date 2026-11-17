package Voletin1;

public class Ej2 {
    static void main(String[] args) {

        //Crea un programa que detecte cuántos números negativos hay en un array de
        //enteros.

        //Definir variables
        //ARRAY
        int[] enteros = {-1, 2, 3, -4, 5, -6};

        System.out.println("La cantidad de numeros negativos es " + CalcularNumerosNegativos(enteros));
    }

    //Suma de posisiones
    static int CalcularNumerosNegativos(int[] enteros){
        int negativos = 0;

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] < 0) {negativos++;}
        }
        return negativos;
    }

}
