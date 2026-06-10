import java.util.*;
public class oneton {
    static void print(int n){
        if(n==0)
            return;
        print(n-1);
        System.out.print(n+" ");



    }


    static void printa( int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printa(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        print(n);
        System.out.println();
        printa(n);
        sc.close();
    }

}
