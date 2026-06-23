package gfg;

import java.util.Scanner;

public class floorsortedarray {
    public int findFloor(int []arr, int x){
        int floor=-1;
        for( int i=0; i<arr.length; i++){
            if(arr[i]<=x){
                floor=arr[i];
                floor=i;
            }
            else{
                break;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= {1, 2, 8, 10, 10, 12, 19};
        int x =5;
        floorsortedarray obj = new floorsortedarray();
        int result = obj.findFloor(arr,x);
        System.out.println("Index:"+result);
    }
}
