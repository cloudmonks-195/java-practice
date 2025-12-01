import java.util.*;

public class print {

    public static void main(String[] args) {

        // 1️⃣ void function (prints only, returns nothing)
        helloVoid();

        // 2️⃣ int function (returns integer)
        int number = giveMeNumber();
        System.out.println("Returned int: " + number);

        // 3️⃣ String function (returns text)
        String name = giveMeString();
        System.out.println("Returned String: " + name);

        // 4️⃣ boolean function (returns true/false)
        boolean isAdult = checkAdult(20);
        System.out.println("Returned boolean: " + isAdult);
    }


    // 1️⃣ -------- VOID FUNCTION --------
    // void = returns nothing
    static void helloVoid() {
        System.out.println("Hello from void function!");
        // no return value allowed
    }


    // 2️⃣ -------- INT FUNCTION --------
    // int = must return an integer
    static int giveMeNumber() {
        int a = 10;
        int b = 20;
        return a + b;  // returns integer
    }


    // 3️⃣ -------- STRING FUNCTION --------
    // String = must return text
    static String giveMeString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        return name;   // returning text
    }


    // 4️⃣ -------- BOOLEAN FUNCTION --------
    // boolean = must return true or false
    static boolean checkAdult(int age) {
        return age >= 18;  // true or false
    }
}
