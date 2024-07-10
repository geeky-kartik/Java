package Strings;

import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hi " + name);
    }
}
