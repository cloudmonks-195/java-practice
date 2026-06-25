package gfg;

import java.util.ArrayList;

public class removeduplicatesinarray {
    ArrayList<Integer> removeDuplicates(int []arr){
        ArrayList<Integer>duplicates = new ArrayList<>();
        if(arr.length==0){
            return duplicates;
        }
        duplicates.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int arr[]={2,2,2,2,2};
        ArrayList<Integer>result = new ArrayList<>();
        removeduplicatesinarray obj= new removeduplicatesinarray();
        result = obj.removeDuplicates(arr);
        System.out.println(result);
    }
}
