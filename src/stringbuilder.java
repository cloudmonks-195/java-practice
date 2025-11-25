import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();

        for(int i=0; i<26; i++){
            char ch= (char)('a'+i);
            builder.append(ch);

        }
        System.out.println(builder.toString());
//        methods
//        implement all the functions of string builder-->
// --> append, reverse, delete, Insert,replace ,toString
    }

}
