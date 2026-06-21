package gfg;
import java.util.*;

public class paranthesischecker {
    public boolean isBalanced(String s){
            char[]arr=s.toCharArray(); //this will convert a string into a character array
            int top=-1;     // represents the top of the stack

            for(int i=0; i<arr.length; i++){
                char ch =arr[i];   //stores the current bracket in ch

                if( ch=='(' || ch=='{' || ch=='['){
                    arr[++top]=ch;   //it means we will push in stack

                }
                else{
                    if(top==-1){
                        return false;

                    }
                    char open=arr[top--];

                    if((ch==')' && open!='(') || (ch=='}' && open!='{') || (ch==']' && open!='[')){
                        return false;
                    }
                }
            }
        return top==-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String s = sc.nextLine();

        paranthesischecker obj = new paranthesischecker();

        if(obj.isBalanced(s)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalancd");
        }
    }
}
