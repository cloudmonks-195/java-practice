package gfg;

public class countfrequency {
    int count(int[]arr,int target){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr={1,2,53,4,5,82,2,2,2,2};
        int target=2;
        countfrequency obj = new countfrequency();
        int res = obj.count(arr,target);
        System.out.println(res);
    }
}
