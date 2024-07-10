package Strings;

import java.util.Scanner;

public class CountDigitsUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String str = Integer.toString(n);

        System.out.println(str.length());
    }
}
