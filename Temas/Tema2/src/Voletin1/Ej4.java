package Voletin1;

import Cosas.MiEntradaSalida;

public class Ej4 {
    static void main(String[] args) {


        //Soluciona el siguiente problema del anterior boletín utilizando arrays. Crea un
        //programa que cree 6000 números aleatorios de 0 a 100 (usa una constante para fijar
        //este número).

        //Muestra:
        //● La media de los números leídos.
        //● El dígito en el que más números terminan.
        //● En qué dígitos no ha terminado ningún número.
        //● Cuántos números terminan en cada uno de los dígitos (0 .. 9).
        //● Calcula a qué % del total de números creados equivale cada elemento del
        //punto anterior.
        //● Calcula también la suma total de todos los porcentajes calculados y la media
        //de porcentajes para los valores contados (es decir, la suma de todos los
        //porcentajes entre 6 (los valores 0, 1, 2, 3, 4 y 5))

        int enterointroducidom0 = 600;

        //OPCIONAL preguntar numero de valores
        enterointroducidom0 = MiEntradaSalida.leerEnteroPositivo("Cuantos valores aleatorios quieres");

        //Definir variables
        int[] numerosAleatorios;
        numerosAleatorios = new int[enterointroducidom0];
        double media =0;

        boolean salir = false;
        boolean capicua = false;
        int ultimodigito = 0;
        int primerdigito = 0;
        int masRepetido =0;
        int menosRepetido =0;
        int repeticionesMenor = Integer.MAX_VALUE;
        int repeticiones =0;

        int[] ultimodigitotrue;
        ultimodigitotrue = new int[enterointroducidom0];

        int[] primerdigitotrue;
        primerdigitotrue = new int[enterointroducidom0];

        int[] numeroultimosdigitos;
        numeroultimosdigitos = new int[10];

        //DAR LOS 600 NUMEROS ALEATORIOS
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 100);
        }

        double[] porcentajes;
        porcentajes = new double[10];

        //CALCULOS

        //CALCULAR MEDIA
        for (int i = 0; i < numerosAleatorios.length; i++) {
            media = media + numerosAleatorios[i];
        }
        media = media / numerosAleatorios.length;

        //CALCULAR Digitos
        for (int i = 0; i < numerosAleatorios.length; i++) {

            int numero = numerosAleatorios[i];

            ultimodigito = (numero % 10);

            while (numero > 0) {
                primerdigito = (numero % 10);
                numero = numero / 10;
            }

            //DAR VALORES DE LOS ULTIMOS Y PRIMEROS DIGITOS DE LOS NUMEROS
            ultimodigitotrue[i] = ultimodigito;
            primerdigitotrue[i] = primerdigito;

            //CONTAR CADA ULTIMO DIGITO
            numeroultimosdigitos[ultimodigito] = numeroultimosdigitos[ultimodigito] + 1;

            //MOSTRAR VALORES OPCIONAL
            //System.out.println("el valor del numero "+ i + " es " + numerosAleatorios[i]);
            //System.out.println("primer digito del numero "+ i + " es " + primerdigitotrue[i]);
            //System.out.println("ultimo digito del numero "+ i + " es " + ultimodigitotrue[i]);

        }

        //CALCULAR ULTIMO DIGITO QUE MAS SE REPITE Y COSAS DEL ULTIMO DIGITO
        for (int i = 0; i < numeroultimosdigitos.length; i++) {

            //MOSTRAR EN CADA DIGITO Q TERMINAN LOS NMEROS
            System.out.println("El ultimo digito " + i + " se ha repetido " + numeroultimosdigitos[i]);

            //CALCULAR EL MAS REPETIDO Y SUS REPETICIONES
            if (numeroultimosdigitos[i] > repeticiones) {
                masRepetido = i;
                repeticiones = numeroultimosdigitos[i];
            }

            //CALCULAR EL MENOS REPETIDO Y SUS REPETICIONES
            if (numeroultimosdigitos[i] < repeticionesMenor) {
                menosRepetido = i;
                repeticionesMenor = numeroultimosdigitos[i];
            }

            //CALCULAR PORCENTAJES
            porcentajes[i] = numeroultimosdigitos[i] / numeroultimosdigitos.length;
            System.out.println("Porcentaje de "+ i + " es " + porcentajes[i]);
        }

        System.out.println("El ultimo numero mas repetido es " + masRepetido + " se ha repetodo " + repeticiones + " veces");
        System.out.println("El ultimo numero menos repetido es " + menosRepetido + " se ha repetodo " + repeticionesMenor + " veces");
        System.out.println("La media es " + media);

    }
}
