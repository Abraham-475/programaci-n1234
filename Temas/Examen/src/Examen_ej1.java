
import java.util.Scanner;

public class Examen_ej1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DEFINI VARIABLES
        String piloto ="";
        int vueltas = 0;
        boolean salir = false;
        boolean preparado = false;
        double tiempoj = 0;
        double tiempov = 0;
        double tiempototal = 0;
        double mejortiempo = 1000;
        int env = 0;
        int vueltasm = 0;
        double guardado = 0;
        double media = 0;

        //PEDIR NOMBRE AL PILOTO
        System.out.println("Bienvenido a los entrenamientos del GP de Isla Cristina de F1");
        System.out.println("Escribe el nombre del piloto");
        piloto = sc.nextLine();

        //PEDIR VUELTAS
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Cuantas vueltas dar en la pista");
            vueltas = sc.nextInt();

            if (vueltas >= 3) {
                if (vueltas <= 10) {
                    //Salir del bucle
                    salir = true;
                } else {
                    System.out.println("incorrecto, vueltas solo admisibles entre 3 y 10");
                }
            }
        }

        salir = false;
        //PEDIR TIEMPO
        while (!salir) {

            //PREGUNTAR numero
            System.out.println("Introduzca el riempo objetivo");
            tiempoj = sc.nextDouble();

            if (tiempoj > 0) {
                salir = true;

            } else {
                System.out.println("Deve ser mayor a 0");
            }
        }


        //PEDIR TIEMPO EN CADA VUELTA
        for (int i = 1; i <= vueltas; i++) {
            salir = false;
            while (!salir) {
                System.out.println("Tiempo de la vuelta " + i);
                tiempov = sc.nextDouble();

                //Comprova si es valido
                if (tiempov > 0) {

                    //Si ha superao o no
                    if (tiempov == tiempoj) { System.out.println("Objetivo igualado"); }
                    if (tiempov < tiempoj) { System.out.println("Objetivo mejorado"); vueltasm = vueltasm + 1; }
                    if (tiempov > tiempoj) { System.out.println("Por encima del objetivo"); }

                    //VALORES DE LAS VUELTAS Y TIEMPOS
                    tiempototal = tiempototal + tiempov;
                    if (guardado != tiempov) {
                        if (tiempov < mejortiempo) {
                            mejortiempo = tiempov;
                            env = i;
                            guardado = tiempov;
                        }
                    }


                    salir = true;
                } else {
                    System.out.println("Deve ser mayor a 0");
                }

            }
        }

        //Calculos

        //Media
        media = tiempototal / vueltas;
        if (vueltasm > (vueltas / 2)) {

            if (media < tiempoj) { preparado = true; }

        }

        //TRAS FINALIZAR LAS VUELTAS
        System.out.println("------------INFORME------------");
        System.out.println("Piloto: " + piloto);
        System.out.println("Teimpo total: " + tiempototal);
        System.out.println("Mejor tiempo: " + mejortiempo);
        System.out.println("Conseguido en la vuelta " + env);
        System.out.println("Vueltas que mejoran el objetivo " + vueltasm);
        if (preparado == true) {
            System.out.println("Preparado para competir");
        } else {
            System.out.println("Necesita otra tanda de entrenamiento");
        }
    }
}
