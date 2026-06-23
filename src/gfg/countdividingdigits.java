package gfg;
import java.util.*;

public class countdividingdigits {
    static int evenlyDivides(int n){
        int num=n;
        int count=0;
        int div;
        while(n!=0){
            div = n%10;
            n=n/10;
            if(div==0) continue;
            if(num%div==0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
//        countdividingdigits obj = new countdividingdigits();
        int res = evenlyDivides(m);
        System.out.println(res);
    }
}
