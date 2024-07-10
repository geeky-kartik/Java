package Recursion;

import java.util.Scanner;

public class PrintIncreasingM2 {
    //Method - 2

    public static void printNum(int x, int n) {
        if (x > n) {
            return;
        }
        System.out.println(x);
        printNum(x + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNum(1, n);

    }
}
