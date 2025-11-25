import java.util.*;
public class methods {
    public static void main(String[] args) {
        String s ="Ashutosh Pandey";
        System.out.println(Arrays.toString(s.toCharArray()));  // convert string into a
        System.out.println(s.indexOf("A"));
        System.out.println(s.toLowerCase()); // converts all the letters in small letters
        System.out.println(s.toUpperCase());  // converts all the letter to capital letters
        System.out.println(Arrays.toString(s.split(" "))); // automatically splits char whenever it finds a space
    }
}
