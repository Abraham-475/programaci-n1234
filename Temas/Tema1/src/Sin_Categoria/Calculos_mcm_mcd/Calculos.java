package Sin_Categoria.Calculos_mcm_mcd;

public class Calculos {

    // CALCULAR EL MAXIMO COMUN DIVISOR
    public static int calcularMCD(int numero1, int numero2) {

        int resto;

        while (numero2 != 0) {

            resto = numero1 % numero2;

            numero1 = numero2;
            numero2 = resto;
        }

        return numero1;
    }

    // CALCULAR EL MINIMO COMUN MULTIPLO
    public static int calcularMCM(int numero1, int numero2) {

        int mcd;
        int mcm;

        mcd = calcularMCD(numero1, numero2);

        mcm = (numero1 / mcd) * numero2;

        return mcm;
    }
}