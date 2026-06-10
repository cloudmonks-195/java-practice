import java.util.*;

public class dgtcount {
    static int count(int n){
        n = Math.abs(n);
        if(n==0)
            return 0;
        return 1+count(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Count=1");
        }
        else{
        System.out.println("Number of digits:"+count(n));
    }}
}
