package maybootcamp;

import java.util.Scanner;

public class firstandlastelementdifferencearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter elements of array: ");
        //input of array
        for (int i = 0; i < n; i++) {

            a[i]=sc.nextInt();
        }

        System.out.println("difference of first and last elements of array: ");


        int diff =a[n-1]-a[0];


        System.out.println("Difference of array is: "+diff);
    }
}
