import java.util.*;
// functions is nothing just a block of code.

public class functions01 {
    public static int maina(int a, int b){
        int sum =a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum= maina(a,b);
        System.out.println(sum);
    }


}
