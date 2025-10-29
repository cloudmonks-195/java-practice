import java.util.*;

public class leetcode {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ans="";
        int n=sc.nextInt();
        while(n>0){
            int rem=(n-1)%26;
            char ch=(char)('A'+rem);
            ans=ch+ans;
            n=(n-1)/26;

        }
        System.out.println(ans);

    }

}
