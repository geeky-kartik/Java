package Recursion;

import java.util.Scanner;

public class SumToN_M1 {

    public static void printSum(int n, int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        printSum(n-1, s+n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = sc.nextInt();

        printSum(num, 0);
    }
}
