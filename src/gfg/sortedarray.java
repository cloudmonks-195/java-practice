package gfg;

public class sortedarray {
    public boolean isSorted(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr1= {1,2,3,4,5};
        sortedarray obj = new sortedarray();
        boolean res = obj.isSorted(arr1);
        System.out.println(res);

    }
}
