package miPrincipal;

import java.util.Scanner;

public class AppMaximoComunDivisor {
    public static void menu() {
        System.out.println("********************");
        System.out.println("MAXIMO COMUN DIVISOR");
        System.out.println("********************");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese a");

        int a = scaner.nextInt();
        System.out.println("Ingrese b");
        int b = scaner.nextInt();
        System.out.println(mcdIte(a, b));

    }

    public static int mcdRecu(int m, int n) {
        return 0;
    }

    public static int mcdIte(int a, int b) {

        int temporal;
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        
        return a;

    }

}