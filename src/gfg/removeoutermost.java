package gfg;
import java.util.*;
public class removeoutermost {

    public String remove(String s) {
        String ans="";
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch==')'){
                count--;
            }
            if(count!=0){
                ans+=ch;
            }
            if(ch=='('){
                count++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st="(()())(())";
        removeoutermost obj = new removeoutermost();
        System.out.println(obj.remove(st));
    }
}
