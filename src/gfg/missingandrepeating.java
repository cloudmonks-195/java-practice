package gfg;
import java.util.*;
public class missingandrepeating {
    ArrayList<Integer> findtwoElements(int []arr){
        ArrayList<Integer>ans= new ArrayList<>();
        Arrays.sort(arr);
        int repeating=-1;
        int missing=-1;

        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                repeating=arr[i];
                break;
            }
        }

        int expected=1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==expected){
                expected++;
            }
            else if(arr[i]>expected){
                missing =expected;
                break;

            }
        }
        if(missing==-1){
            missing =arr.length;
        }
        ans.add(repeating);
        ans.add(missing);

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr={2,2};
        missingandrepeating obj = new missingandrepeating();
        ArrayList<Integer>arrayList = obj.findtwoElements(arr);
        System.out.println(arrayList);

    }
}
