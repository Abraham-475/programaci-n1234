package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej9 {
    static void main(String[] args) {

        //Modifica el método anterior y acepta un parámetro “reverse”, que indique si el array
        //debe devolverse ordenado de menor a mayor o al revés.

        int tamaño = MiEntradaSalida.leerEnteroPositivo("Dime el tamaño del array");

        int[] array;
        array = new int[tamaño];

        for (int i = 0; i < array.length; i++) {
            array[i] =MiEntradaSalida.leerEnteroPositivo("Dime el valor " + i );
        }
        int posision = MiEntradaSalida.leerEnteroPositivo("Dime la posision del valor que quieras buscar");

        //Funcion reverse
        String reverse = MiEntradaSalida.leerVerdaderoFalso("Quieres que este ordenado normal S o alreves N");
<<<<<<< HEAD
        //TERMINARLUEGOOOOOOOOOOOOOO
=======
        if (reverse == "S") {
            //OREDENAR MENOR A MAYOR
            array = MiEntradaSalida.ordenarArray(array);
        } else {
            //ORDENAR MAYOR A MENOR
            array = MiEntradaSalida.ordenarArrayAlreves(array);
        }

        //MOSTRAR ORDEN
        System.out.println("Este es el orden de tu array ahora");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
>>>>>>> a36f2d0 (Ej 14 termnao)

        //LLAMAR A LA CLASE
        int encontrado = crearArray(posision, array);

        //MOSTRAR RESULTADO
        System.out.println("El valor encontrado en la posision " + posision + " es " + encontrado);

    }

    //CLASE
    static int crearArray (int posision, int[] tamaño) {

        int encontrado = tamaño[posision];
        if (tamaño[posision] == 0) {encontrado = -1;}

        return encontrado;
    }
}
