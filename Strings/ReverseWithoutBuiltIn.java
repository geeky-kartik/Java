package Strings;

import java.util.Scanner;

public class ReverseWithoutBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to reverse: ");
        String str = sc.nextLine();

        // Create a StringBuilder from the input string
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();

        // Swap characters from both ends of the StringBuilder
        for (int i = 0; i < n / 2; i++) {
            // Get characters from both ends
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(n - 1 - i);

            // Swap them
            sb.setCharAt(i, ch2);
            sb.setCharAt(n - 1 - i, ch1);
        }

        System.out.println("Reversed String: " + sb.toString());
    }
}
