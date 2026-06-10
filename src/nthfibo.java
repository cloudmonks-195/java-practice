import java.util.*;
public class nthfibo {

    static int fib(int n) {
        // base cases
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Nth Fibonacci number 7= " + fib(n));

        sc.close();
    }
}
