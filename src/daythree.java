import java.util.*;
public class daythree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//            System.out.print("Enter number:");
//            int n = sc.nextInt();
//            int fact=1;
//            while(n>0){
//                fact = fact*n;
//                n--;
//            }
//            System.out.println("Factorial:"+fact);

        // fibonacci series

        System.out.print("Enter number till you want fibonacci series:");
        int m = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<m; i++){
            int c= a+b;
            System.out.print(c);
            a=b;
            b=c;

        }



        sc.close();

    }
}
