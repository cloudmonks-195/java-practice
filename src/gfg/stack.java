package gfg;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int a=s.peek();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
        System.out.println("top of the stack is :"+a);
    }
}
