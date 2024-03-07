package miPrincipal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("*************************");
            System.out.println("TIPOS ABSTRACTOS DE DATOS");
            System.out.println("*************************");
            System.out.println("1) LADRILLOS");
            System.out.println("2) FACTORIAL");
            System.out.println("3) NATURALES");
            System.out.println("4) SUMA DIGITOS");
            System.out.println("5) ALFABETO");
            System.out.println("6) MCD");
            System.out.println("7) FIBONACCI");
            System.out.println("8) ORDENAMIENTO SELECCION ");
            System.out.println("9) TORRES DE HANOI");
            System.out.println("10) SERIE DE FIBONACCI");
            System.out.println("11) PERFORMANCE SERIE FIBONACCI");
            System.out.println("12) ORDENAMIENTO POR MEZCLAS");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc = consola.nextInt();

            switch (opc) {
                case 1:
                    AppLadrillos.menu();
                    break;
                case 2:
                    AppFactorial.menu();
                    break;
                case 3:
                    AppNaturales.menu();
                    break;
                case 4:
                    AppSumaDigitas.menu();
                    break;
                case 5:
                    AppAlfabeto.menu();
                    break;
                case 6:
                    AppMaximoComunDivisor.menu();
                    break;
                case 8:
                    AppFibonacci.menu();
                    break;
                case 9:
                    AppFibonacci.menu();
                    break;
                case 10:
                    AppFibonacci.menu();
                    break;
                case 11:
                    AppFibonacci.menu();
                    break;
                case 12:
                    AppFibonacci.menu();
                    break;
                case 0:
                    System.out.println("ADIOS!");
                    consola.close();
                    break;

                default:
                    System.out.println("Valor incorrecto, intente de nuevo!");

            }

        } while (opc != 0);

    }
}