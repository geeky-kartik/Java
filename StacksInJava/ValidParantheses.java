package StacksInJava;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValidParantheses (String str) {
        Stack<Character> st = new Stack<>();

        char[] chArr = str.toCharArray();
        for (char ch : chArr) {
            if (ch == '(') {
                st.push(')');
            }
            else if (ch == '{') {
                st.push('}');
            }
            else if (ch == '[') {
                st.push(']');
            }
            else if (st.isEmpty() || st.pop() != ch) {
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "()[]{}";


        System.out.println(isValidParantheses(str));
    }
}
