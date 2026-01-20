import java.sql.SQLOutput;
import java.util.*;
//patterns for day1
public class firstday {
    public static void main(String[] args) {
        for(int i=0; i<6; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("Inverted right angled triangle");

        // second part
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("Number Triangle");

        for(int i=0; i<=6; i++){
            for(int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("Pyramid");
        // Question 2
        //star pyramid
        for(int i=1; i<6;i++){
            // spaces
            for(int j=i; j<6; j++){
                System.out.print(" ");
            }
            // stars
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pyramid");
        // Question 2
        //star pyramid
        for(int i=1; i<6;i++){
            // spaces
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // stars
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }






    }


}
