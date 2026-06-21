package gfg;
import java.util.*;
import java.util.ArrayList;


public class duplicates {
    static ArrayList<Integer>findduplicates(int arr[]){
        ArrayList<Integer>duplicates=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                if(duplicates.isEmpty() || duplicates.get(duplicates.size()-1)!=arr[i]){
                    duplicates.add(arr[i]);
                }
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr= new int[1];
        System.out.println("Enter 5 elements");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>result= findduplicates(arr);
        System.out.println(result);
    }
}
