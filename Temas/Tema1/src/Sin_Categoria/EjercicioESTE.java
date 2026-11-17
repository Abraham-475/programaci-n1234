import java.util.Scanner;

public class EjercicioESTE {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca otro numero");
        int numero2 = sc.nextInt();
        System.out.println("Introduzca un simbolo para la operacion");
        char simbolo = sc.next().charAt(0);

        if (simbolo == '+') {
            int resultado = numero1 + numero2;
            System.out.println("la suma da "+ resultado);
        }
        else {

            if (simbolo == '-') {
                int resultado = numero1 - numero2;
                System.out.println("la resta da "+ resultado);
            }
            else {

                if (simbolo == '*') {
                    int resultado = numero1 + numero2;
                    System.out.println("la multiplicacion da "+ resultado);
                }
                else {

                    if (simbolo == '/') {
                        int resultado = numero1 / numero2;
                        System.out.println("la division da "+ resultado);
                    }
                    else {

                        System.out.println("error, simbolo no reconocido");
                    }
                }
            }
        }
    }
}