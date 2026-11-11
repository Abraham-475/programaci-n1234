package Sin_Categoria.Calculos_mcm_mcd;

import java.util.Scanner;

// HACE UN PROGRAMA QUE CALCULE EL MCM Y EL MCD

public class Ejercicio_mcm_y_mcd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // DEFINIR VARIABLES
        int numero1;
        int numero2;
        int mcd;
        int mcm;

        // PEDIR NUMEROS
        System.out.println("Introduce el primer numero:");
        numero1 = sc.nextInt();

        System.out.println("Introduce el segundo numero:");
        numero2 = sc.nextInt();

        // CALCULAR MCD Y MCM
        mcd = Calculos.calcularMCD(numero1, numero2);
        mcm = Calculos.calcularMCM(numero1, numero2);

        // MOSTRAR RESULTADOS
        System.out.println("El MCD es: " + mcd);
        System.out.println("El MCM es: " + mcm);

        sc.close();
    }
}