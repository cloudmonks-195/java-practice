package gfg;

import java.sql.SQLOutput;
import java.util.Scanner;

public class subtheproductandsum {
    public int sub(int n){
        int diff=0;
        int product=1;
        int sum=0;
        int temp=n;
        while(temp!=0){
            int e= temp%10;
            product=e*product;
            sum=e+sum;
            temp=temp/10;
        }
        System.out.println(product);
        System.out.println(sum);

        return product-sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        subtheproductandsum obj = new subtheproductandsum();
        System.out.println(obj.sub(234));
    }
}
