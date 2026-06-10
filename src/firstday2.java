import java.util.*;
public class firstday2 {
    public static void main(String[] args) {
        for(int i=0; i<6; i++){
            for(int j=0; j<i; j++){
                char ch=(char)('A'+j);
                System.out.print(ch);
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("Diamond ");
        System.out.println();

        for(int i=0; i<6; i++){
            for(int j=i; j<6; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // reverse pyramid
        for(int i=5; i>=1; i--){
            for(int j=i; j<6; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // number
        System.out.println();
        System.out.println("Number pyramid");
        System.out.println();
        for(int i=0; i<6; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Inverted Number pyramid");
        System.out.println();
        for(int i=5; i>0; i--){
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
