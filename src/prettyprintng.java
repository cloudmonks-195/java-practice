import java.util.*;
public class prettyprintng {
    public static void main(String[] args) {
        float a= 3.42454f;
        System.out.printf("Formatted number is %.2f\n",a);
        System.out.printf("Pie %.3f\n",Math.PI);
        System.out.printf("Hello my name is %s  and i am %s\n","Ashu","Cool");


        // operators
        System.out.println('a'+'b');   // output as addition of ascii values
        System.out.println("a"+"b");   // concatenation
        System.out.println((char)('a'+1));   // char keyword is used to convert a character into a number

//        Note:-->  integer will be converted to integer  that will call toString()
//        after few steps this will do it as "a"+1
        System.out.println("a"+1);

        System.out.println("Ashu"+new ArrayList<>());
        System.out.println("Ashu"+new Integer(56));

    }
}
