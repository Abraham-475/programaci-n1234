package Ejemplos_Comandos;

import java.util.Scanner;

public class switch_ej {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //elegir un valor (opcional)
        System.out.println("responde solo con: S o N");
        char sn = sc.next().charAt(0);

        //Comprueva con el switch
        switch (sn) {
            case 's':
            case 'S':
                System.out.println("Has elegido S");
                break;

            case 'n':
            case 'N':
                System.out.println("Has elegido N");
                break;

            default:
                System.out.println("Escribe solo S o N, gil");
        }
    }
}
