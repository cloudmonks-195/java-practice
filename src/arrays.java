import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        System.out.println(Arrays.toString(arr));

        swap(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

        // finding max //different program
        int[] ab = {1,2,3,4,5,6};
        System.out.println(max(ab));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] ab){
        int maxval = ab[0];
        for(int i = 1; i < ab.length; i++){
            if(ab[i] > maxval){
                maxval = ab[i];
            }
        }
        return maxval;
    }
}
