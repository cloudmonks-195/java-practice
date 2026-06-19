package gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayleaders {
    static ArrayList<Integer>leaders(int arr[]){
        ArrayList<Integer>leaders = new ArrayList<>();
        int n = arr.length;
        int maxright= arr[n-1];
        leaders.add(maxright);
        for( int i=n-2; i>=0; i--){
            if(arr[i]>maxright){
                maxright=arr[i];
                leaders.add(maxright);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[]= new int[m];
        for(int i=0; i<m; i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>result= leaders(arr);
        System.out.println(result);



    }
}
