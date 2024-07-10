package Recursion;

import java.util.Scanner;

public class PrintIncreasingM1 {
    //Method - 1
    static int n; // Declare n as a static variable

    public static void printNum(int x) {
        if (x > n) {
            return;
        }
        System.out.println(x);
        printNum(x + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt(); // Initialize the static variable n
        printNum(1);
    }
}
