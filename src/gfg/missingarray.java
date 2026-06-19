package gfg;

import java.util.Scanner;

public class missingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,8};
        int n = arr.length +1;
        int expectedsum =n*(n+1)/2;
        int actualsum = 0;
        for(int i=0; i<arr.length; i++){
            actualsum+=arr[i];
        }
        System.out.println("Missing number: "+ (expectedsum-actualsum));




    }
}
