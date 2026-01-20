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
    }

}
