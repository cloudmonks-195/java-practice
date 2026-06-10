import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class daytwo {
    public static void main(String[] args) {
        for(int i=0; i<6; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Right inverted triangle");
        System.out.println();
        // second pattern
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Number triangle");
        for(int i=0; i<6; i++){
            for(int j=1; j<=i; j++){
               // char ch= (char)('A'+j);
                System.out.print(j);
            }
            System.out.println();
        }

        // Character Triangle
        System.out.println();
        System.out.println("character Triangle");
        System.out.println();
        for(int i=0; i<6; i++){
            for(int j=0; j<=i; j++){
                 char ch= (char)('A'+j);
                System.out.print(ch);
            }
            System.out.println();
        }

        // pyramid
        System.out.println();
        System.out.println("Pyramid ");
        System.out.println();


        for(int i=0; i<6; i++){
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
        System.out.println("Hollow Pyramid");
        System.out.println();
        int n = 5;   // height of the pyramid

        for (int i = 1; i <= n; i++) {

            // left side spaces
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }

            // stars aur spaces
            for (int j = 1; j <= (2 * i - 1); j++) {

                // first row, last row ya boundary star
                if (i == 1 || i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        // inverted hollow pyramid
        System.out.println();
        System.out.println("Inverted hollow pyramid");
        System.out.println();
        for (int i = n; i >= 1; i--) {

            // spaces
            for (int s = n; s > i; s--)
                System.out.print(" ");

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || i == 1 || j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("number Pyramid ");
        System.out.println();


        for(int i=0; i<6; i++){
            // spaces
            for(int j=i; j<6; j++){
                System.out.print(" ");
            }
            // stars
            for(int k=1; k<=(2*i-1); k++){
                System.out.print(k);
            }
            System.out.println();

        }

    }
}
