import java.sql.SQLOutput;
import java.util.*;

public class poweroftwo {
    static boolean power(int n) {
        if (n == 1)
            return true;
        if (n == 0 || n % 2 != 0)
            return false;
        return power(n / 2);

    }
    static long powerOfTwo(int n) {
        if (n == 0)
            return 1;  // 2^0 = 1
        return 2 * powerOfTwo(n - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check :");
        int n = sc.nextInt();
        if(power(n)){
            System.out.println("Yes, Power of two.");
        }
        else{
            System.out.println("No, Not a power of two.");
        }

        System.out.print("Enter exponent n to calculate 2^n: ");
        int exp = sc.nextInt();
        long result = powerOfTwo(exp);
        System.out.println("2^" + exp + " = " + result);

        sc.close();
    }
}

