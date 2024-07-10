package StacksInJava;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of stack: ");
        while (sc.hasNextInt()) {
            int element = sc.nextInt();
            st.push(element);
            System.out.println("Enter anything except integer to stop!");
        }

        System.out.println(st);

        Stack<Integer> reverseSt = new Stack<>();
         while (!st.isEmpty()) {
             reverseSt.push(st.pop());
         }
        System.out.println(reverseSt);


    }
}
