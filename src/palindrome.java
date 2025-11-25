public class palindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(ispalindrone(s));


    }
    static boolean ispalindrone(String s){
        s=s.toLowerCase();
        for(int i=0; i<=s.length()/2; i++){
            char start= s.charAt(i);  // first element
            char end= s.charAt(s.length()-1 -i);  // last element
            if(start!=end){
                return false;
            }


            }
        return true;
        }

    }

