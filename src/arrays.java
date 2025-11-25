import java.util.*;
public class arrays {
    public static void main(String[] args){
        //Scanner str = new Scanner(System.in);

        // null type- any reference variable we have by defaut we have null type.
//        String [] arr=new String[4];
//        System.out.println(arr[0]);

//        // input directly
//        int [] arr= new int[3];
//        arr[0]=1;
//        arr[1]=3;
//        arr[2]=5;
//        System.out.println(Arrays.toString(arr));

//        // input using for loop
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Size of the array:");
//        int size =sc.nextInt();
//        int [] arr= new int[size];
//
//        // INPUT USING LOOPS
//        for(int i=0; i<size; i++){
//            arr[i]=sc.nextInt();
//        }
//
//        // output
//        for(int i =0; i<size; i++){
//            System.out.print(arr[i]+" ");
//        }

          // FOR EACH lOOP
//        for(int num:arr){ // for every element in array ,print the element
//            System.out.println(num +" "); //here num represents elements of the array
//        }

        // STRING ARRAY OR ARRAY OF OBJECTS
        String[] str =new String[4];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<str.length; i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="kunal";
        System.out.println(Arrays.toString(str));
    }
}
