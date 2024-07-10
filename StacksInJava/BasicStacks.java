package StacksInJava;

import java.util.Stack;

public class BasicStacks {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.pop());

        System.out.println(st);

        System.out.println("Size of stack: " + st.size());

        //to access first element of stack
        while (st.size() > 1) {
            st.pop();
        }
        System.out.println("First element of the stack: " + st.peek());

        System.out.println("is Stack empty? " + st.isEmpty());
    }
}
