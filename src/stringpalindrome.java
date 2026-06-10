
import java.util.*;
public class stringpalindrome {
    static boolean ispalindrome(String s, int start, int end){
        if(start>=end)
            return true;
        if(s.charAt(start)!=s.charAt(end))
            return false;
        return ispalindrome(s, start+1, end-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        s = s.replaceAll("\\s+","").toLowerCase();
        if(ispalindrome(s,0,s.length()-1))
            System.out.println("yes,it is palindrome.");
        else{
            System.out.println(" no it is not a palindrome.");

        }
        sc.close();
    }
}
