package gfg;

import java.util.Scanner;

public class nthFibonnaci {
    public int Fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        nthFibonnaci obj = new nthFibonnaci();
        int result = obj.Fibonacci(n);
        System.out.println(result);
    }
}
