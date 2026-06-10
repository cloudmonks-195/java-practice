package maybootcamp;
import java.util.*;

public class maxsuminmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int r = sc.nextInt();
        System.out.println("Enter column");
        int c =sc.nextInt();

        int a[][]=new int[r][c];

        System.out.println(" Enter Matrix elements");
        for (int i =0; i<r; i++){
            for( int j=0; j<c; j++){
                a[i][j]=sc.nextInt();
            }
        }
        int maxSum= Integer.MIN_VALUE;
        int maxrow=-1;

        //find row with max sum
        for (int i = 0; i < r; i++) {
            int sum=0;
            for( int j=0; j<c; j++){
                sum=sum +a[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                maxrow=i;
            }
            
        }
        System.out.println("Maximum row sum ="+maxSum);
        System.out.println("Rows to be discarded "+(maxrow+1));

        // Print matrix excluding the row with maximum sum
        System.out.println("Matrix after discarding the row:");
        for (int i = 0; i < r; i++) {
            if (i == maxrow)
                continue;

            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }

}
