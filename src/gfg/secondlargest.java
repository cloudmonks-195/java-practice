package gfg;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int smax=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            else if (arr[i] < max &&arr[i]>smax){
                smax=arr[i];
            }
        }
        System.out.println("Second largest element in the array is :"+smax);

    }
}
