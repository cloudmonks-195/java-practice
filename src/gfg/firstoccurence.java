package gfg;

import java.util.Scanner;

public class firstoccurence {
    public int firstSearch(int arr[], int k){
        for( int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int k = sc.nextInt();

        firstoccurence obj = new firstoccurence();
        int result = obj.firstSearch(arr,k);

        if(result!=-1){
            System.out.println("Element found at index:"+result);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
