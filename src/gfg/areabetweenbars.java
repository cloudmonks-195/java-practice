package gfg;
import java.util.*;

public class areabetweenbars {
    public int maxArea(List<Integer> height){
        int maxArea=0;
        int n = height.size();

        for( int i=0; i<n;i++){
            for( int j=i+1; j<n; j++){
                int h = Math.min(height.get(i),height.get(j));
                int width = j-i-1;

                int area = h*width;

                maxArea= Math.max(maxArea,area);
            }

        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>arr=Arrays.asList(2,5,4,3,7);
        areabetweenbars obj= new areabetweenbars();
        int result = obj.maxArea(arr);
        System.out.println(result);
    }

}
