package miPrincipal;
import java.util.Hashtable;
import java.util.Scanner;
public class FibRecursivoOptimizado {

    public static void menu() {
        Hashtable<Integer.Double> t = new Hashtable<Integer.Double>();
        t.put(1,id);
        t.put(2,id);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos terminos quiere ver?");
        int n = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            double f = AppFibonacci.fibonacciRecOptimizado(i, t);
            System.out.println("fib");
        }
    }
}