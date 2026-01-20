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
        System.out.println("character Triangle");
        System.out.println();
        for(int i=0; i<6; i++){
            for(int j=0; j<=i; j++){
                 char ch= (char)('A'+j);
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
