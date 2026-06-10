import java.util.*;

public class reversestring {

    // Recursive function to reverse a string
    static String reverse(String str) {
        if (str.isEmpty())   // base case
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String reversed = reverse(s);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
