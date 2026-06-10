import java.util.*;
public class sumofnn {
    static int sum(int n){
        // base case
        if(n==0)
            return 0;
        // recursive case
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter natural number:");
        int n= sc.nextInt();
        System.out.println("Sum : "+sum(n));
        sc.close();
    }
}
