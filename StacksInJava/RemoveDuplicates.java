package StacksInJava;

import java.util.Stack;

import java.util.Stack;

public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicates sol = new RemoveDuplicates();
        System.out.println(sol.removeDuplicates("abbaca"));  // Expected output: "ca"
    }
}
