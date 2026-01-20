import java.util.*;
import java.util.Arrays;

public class Main{
    static int maxsubarray(int [] arr){
        int res=arr[0];
        for(int i=0; i<arr.length; i++){
            int currsum=0;
            for(int j=i; j<arr.length; j++){
                currsum+=arr[j];
                res =Math.max(res,currsum);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubarray(arr));
    }
}